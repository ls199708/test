package com.cjg.action.vote;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class NewVoteContext extends VoteContextRoot {

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// 从session中获得投票信息
		Vote vote = (Vote) session.getAttribute("vote");
		// 将投票标题信息添加到数据库
		voteService.addVote(vote);
		Integer vote_id = voteService.findIdByTitle(vote);
		// 从页面获得投票选项信息（数组类型）
		String[] voteContext = context;
		Votecontext votecontext;
		for (int i = 0; i < voteContext.length; i++) {
			votecontext = new Votecontext();
			votecontext.setVoteId(vote_id);
			votecontext.setContext(voteContext[i]);
			votecontext.setCount(0);
			// 将投票选项信息添加到数据库
			voteContextService.addVoteContext(votecontext);
		}
		return SUCCESS;
	}

}
