package com.cjg.domain;

@SuppressWarnings("serial")
public class Count implements java.io.Serializable{
	/**
	 * @param singleCount
	 *            单选投票主题个数
	 * @param multiCount
	 *            多选投票主题个数
	 * @param allCount
	 *            所有投票主题个数
	 */
	private Long singleCount;
	private Long multiCount;
	private Long allCount;

	public Long getAllCount() {
		return allCount;
	}

	public void setAllCount(Long allCount) {
		this.allCount = allCount;
	}

	public Long getMultiCount() {
		return multiCount;
	}

	public void setMultiCount(Long multiCount) {
		this.multiCount = multiCount;
	}

	public Long getSingleCount() {
		return singleCount;
	}

	public void setSingleCount(Long singleCount) {
		this.singleCount = singleCount;
	}

}
