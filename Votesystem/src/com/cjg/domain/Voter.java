package com.cjg.domain;

@SuppressWarnings("serial")
public class Voter implements java.io.Serializable {
	/**
	 * @param id 主键
	 * @voteId 投票编号
	 * @ip 投票人IP
	 */
	private Integer id;
	private Integer voteId;
	private String ip;

	public Voter() {
	}

	public Voter(Integer voteId, String ip) {
		this.voteId = voteId;
		this.ip = ip;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVoteId() {
		return this.voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}