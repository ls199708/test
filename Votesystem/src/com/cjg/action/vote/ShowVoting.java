package com.cjg.action.vote;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Vote;

@SuppressWarnings("serial")
public class ShowVoting extends VoteRoot {
	private static final String VOTECLOSE = "voteclose";

	@Override
	public String execute() throws Exception {
		// 通过投票编号查找投票信息
		Vote vote2 = voteService.findVoteById(voteId);
		// 如果publish!=1,说明投票状态为未开放
		if (vote2.getPublish() != 1) {
			return VOTECLOSE;
		} else {
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			// 如果投票状态为开放，将投票信息放入session的“vote”中
			session.setAttribute("vote2", vote2);
			return SUCCESS;
		}
	}
}
