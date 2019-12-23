package com.cjg.domain;

@SuppressWarnings("serial")
public class VotingInfo implements java.io.Serializable{
	/**
	 * @param context
	 *            投票子选项内容
	 * @param count
	 *            投票数
	 * @param percent
	 *            单个子选项投票数占该投票主题所有投票总数百分比
	 */
	private String context;
	private Integer count;
	private String percent;

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}
}
