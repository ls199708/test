package com.cjg.action.rootaction;

import java.util.List;
import java.util.Map;



import com.cjg.domain.*;
import com.cjg.service.VoteContextService;
import com.cjg.service.VoteService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class VoteContextRoot extends ActionSupport {
	/**
	 * @param context
	 *            子选项内容，数组类型
	 * @param voteId
	 *            投票编号
	 * @param list
	 * @param list2
	 *            封装投票结果信息
	 * @param votecontextId
	 *            投票子选项编号
	 * @param type
	 *            投票类型
	 * @param publish
	 *            是否发布
	 * @param map
	 *            封装投票选项编号及内容
	 */
	protected VoteContextService voteContextService;
	protected VoteService voteService;
	protected String[] context;
	protected Integer voteId;
	protected List<VotingInfo> list2;
	protected Integer votecontextId;
	protected Integer type;
	protected Integer publish;
	protected Map map;

	public Integer getPublish() {
		return publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getVotecontextId() {
		return votecontextId;
	}

	public void setVotecontextId(Integer votecontextId) {
		this.votecontextId = votecontextId;
	}

	public Integer getVoteId() {
		return voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public String[] getContext() {
		return context;
	}

	public void setContext(String[] context) {
		this.context = context;
	}

	public VoteContextService getVoteContextService() {
		return voteContextService;
	}

	public void setVoteContextService(VoteContextService voteContextService) {
		this.voteContextService = voteContextService;
	}

	public VoteService getVoteService() {
		return voteService;
	}

	public void setVoteService(VoteService voteService) {
		this.voteService = voteService;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public List<VotingInfo> getList2() {
		return list2;
	}

	public void setList2(List<VotingInfo> list2) {
		this.list2 = list2;
	}

}
