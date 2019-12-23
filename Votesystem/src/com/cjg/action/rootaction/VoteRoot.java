package com.cjg.action.rootaction;

import java.util.List;


import com.cjg.domain.Vote;
import com.cjg.domain.VoteInfo;
import com.cjg.service.AdminService;
import com.cjg.service.VoteService;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class VoteRoot extends ActionSupport {
	/**
	 * @param voteId 投票编号
	 * @param title 投票标题
	 * @param type 投票类型(1为单选，0为多选)
	 * @param publish 是否开放投票(1为开放，0为不开放)
	 * @param adminId 管理员Id
	 * @param contextcount 子选项个数
	 * @param list 封装全部投票信息
	 * @param list2 封装投票相关信息
	 */
	protected VoteService voteService;
	protected AdminService adminService;
	protected Integer voteId;
	protected String title;
	protected Integer type;
	protected Integer publish;
	protected Integer adminId;
	protected Integer contextcount;
	protected List<Vote> list;
	protected List<VoteInfo> list2;
	//protected Integer flag; 

	public Integer getContextcount() {
		return contextcount;
	}

	public void setContextcount(Integer contextcount) {
		this.contextcount = contextcount;
	}

	public VoteService getVoteService() {
		return voteService;
	}

	public void setVoteService(VoteService voteService) {
		this.voteService = voteService;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getPublish() {
		return publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public List<Vote> getList() {
		return list;
	}

	public void setList(List<Vote> list) {
		this.list = list;
	}

	public Integer getVoteId() {
		return voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	/*public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}*/

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public List<VoteInfo> getList2() {
		return list2;
	}

	public void setList2(List<VoteInfo> list2) {
		this.list2 = list2;
	}

}
