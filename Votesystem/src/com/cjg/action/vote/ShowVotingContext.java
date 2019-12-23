package com.cjg.action.vote;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class ShowVotingContext extends VoteContextRoot {

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// 从session中获得投票信息，主要是投票编号
		Vote vote = (Vote) session.getAttribute("vote2");
		// 通过投票编号查找对应投票选项信息
		List<Votecontext> list = voteContextService
				.findVoteContextByVoteId(vote);
		map = new HashMap();
		for (int i = 0; i < list.size(); i++) {
			// 将投票选项编号及内容存入map
			map.put(list.get(i).getVotecontextId(), list.get(i).getContext());
		}
		// 将map及投票类型传送给对应页面
		setMap(map);
		setType(vote.getType());
		return SUCCESS;
	}
}
