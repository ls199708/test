package com.cjg.domain;

@SuppressWarnings("serial")
public class VoteInfo implements java.io.Serializable{
	/**
	 * @param voteId
	 *            主键
	 * @param title
	 *            投票主题
	 * @param createdate
	 *            投票创建时间
	 * @param publish
	 *            是否开放标识
	 * @param type
	 *            投票类型
	 * @param adminname
	 *            投票创建人用户名
	 */
	private Integer voteId;
	private String title;
	private String createdate;
	private String publish;
	private String type;
	private String adminname;

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getVoteId() {
		return voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
