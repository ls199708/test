package com.cjg.action.vote;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Admin;
import com.cjg.domain.Vote;

@SuppressWarnings("serial")
public class NewVote extends VoteRoot {
	private static final String ADDVOTEERROR = "addVoteError";

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Vote vote = new Vote();
		vote.setTitle(title);
		vote.setType(type);
		vote.setPublish(publish);
		// 获得当前系统时间并格式化，存入创建投票时间
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(date);
		vote.setCreatedate(dateString);
		vote.setAdminId(((Admin) session.getAttribute("admin")).getAdminId());
		List l = voteService.findVoteByTitle(vote);
		if (l != null) {
			addActionError(getText("voteexist"));
			return ADDVOTEERROR;
		} else {
			session.setAttribute("vote", vote);
			session.setAttribute("contextcount", contextcount);
			return SUCCESS;
		}
	}
}
