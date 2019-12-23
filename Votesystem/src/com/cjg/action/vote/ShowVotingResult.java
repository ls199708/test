package com.cjg.action.vote;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;
import com.cjg.domain.VotingInfo;

@SuppressWarnings("serial")
public class ShowVotingResult extends VoteContextRoot {

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		list2 = new ArrayList();
		// 从session获得投票编号
		Integer vid = ((Vote) session.getAttribute("vote2")).getVoteId();
		// 从数据库查询得到对应投票编号总投票数
		Long totalcount = voteContextService.findTotalCountByVoteId(vid);
		// 总投票数存入session的“totalcount”
		session.setAttribute("totalcount", totalcount);
		Vote vote = new Vote();
		vote.setVoteId(vid);
		// 通过投票编号查找对应该编号的子选项内容
		List<Votecontext> list = voteContextService
				.findVoteContextByVoteId(vote);
		for (int i = 0; i < list.size(); i++) {
			// 获得子选项投票数，并计算出占该子选项对应投票的总票数的百分比
			Integer count = list.get(i).getCount();
			BigDecimal bd = new BigDecimal((double) count / totalcount);
			double per = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			String percent = percentFormat.format(per);
			VotingInfo votingInfo = new VotingInfo();
			// 设置子选项内容
			votingInfo.setContext(list.get(i).getContext());
			votingInfo.setCount(count);
			// 设置百分比
			votingInfo.setPercent(percent);
			list2.add(votingInfo);
		}
		setList2(list2);
		return SUCCESS;
	}
}
