package com.cjg.action.vote;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Vote;

@SuppressWarnings("serial")
public class UpdateVote extends VoteRoot {

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// 从session中获得投票信息
		Vote vote = (Vote) session.getAttribute("vote");
		// 如果页面请求中的投票类型及投票状态与数据库中信息相符，不做操作
		if (vote.getType().equals(type) && vote.getPublish().equals(publish)) {
			return SUCCESS;
		} else {
			// 否则，将页面请求中信息更新到数据库
			vote.setType(type);
			vote.setPublish(publish);
			voteService.updateVote(vote);
			return SUCCESS;
		}
	}
}
