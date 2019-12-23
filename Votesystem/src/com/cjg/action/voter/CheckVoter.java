package com.cjg.action.voter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoterRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Voter;

@SuppressWarnings("serial")
public class CheckVoter extends VoterRoot {
	private static final String VOTERERROR = "votererror";

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// 从session获得当前投票编号
		Integer vid = ((Vote) session.getAttribute("vote2")).getVoteId();
		// 由投票编号及当前用户Ip查找投票人信息
		String ip = ServletActionContext.getRequest().getRemoteAddr();
		setIp(ip);
		Voter voter = voterService.findVoterByIp(ip, vid);
		// 如果为空，说明当前投票人未投过票
		if (voter == null)
			return SUCCESS;
		else {
			return VOTERERROR;
		}
	}
}
