package com.cjg.dao;

import java.util.List;

import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;



public interface VoteContextDao {
	/**
	 * 添加投票选项信息
	 * @param voteContext 投票选项信息
	 */
	public void addVoteContext(Votecontext voteContext);
	/**
	 * 通过投票编号查找投票选项
	 * @param vote 投票信息
	 * @return Votecontext（List类型）
	 */
	public List<Votecontext> findVoteContextByVoteId(Vote vote);
	/**
	 * 删除指定的一条投票选项信息
	 * @param voteContext 投票选项信息
	 */
	public void delVoteContext(Votecontext voteContext);
	/**
	 * 增加一条投票选项信息
	 * @param voteContext 投票选项信息
	 */
	public void addOneVoteContext(Votecontext voteContext);
	/**
	 * 更新投票选项信息
	 * @param voteContext 投票选项信息
	 */
	public void updateVoteContext(Votecontext voteContext);
	/**
	 * 通过投票选项编号查找投票选项信息
	 * @param voteContext 投票选项信息
	 * @return Votecontext（Votecontext类型）
	 */
	public Votecontext findVCCountByVCId(Votecontext voteContext);
	/**
	 * 通过投票编号查找对应该编号所有投票数
	 * @param voteId 投票编号
	 * @return 投票数
	 */
	public Long findTotalCountByVoteId(Integer voteId);
}
