package com.cjg.action.vote;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Vote;

@SuppressWarnings("serial")
public class FindOneVote extends VoteRoot {

	@Override
	public String execute() throws Exception {
		Vote vote2 = voteService.findVoteById(voteId);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("vote", vote2);
		return SUCCESS;
	}

}
