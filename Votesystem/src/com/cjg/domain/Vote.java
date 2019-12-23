package com.cjg.domain;

@SuppressWarnings("serial")
public class Vote implements java.io.Serializable {

	private Integer voteId;
	private String title;
	private String createdate;
	private Integer type;
	private Integer publish;
	private Integer adminId;

	public Vote() {
	}

	public Vote(String title, String createdate, Integer type, Integer publish,
			Integer adminId) {
		this.title = title;
		this.createdate = createdate;
		this.type = type;
		this.publish = publish;
		this.adminId = adminId;
	}

	public Integer getVoteId() {
		return this.voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getPublish() {
		return this.publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

}