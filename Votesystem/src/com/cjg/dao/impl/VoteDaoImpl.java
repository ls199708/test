package com.cjg.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cjg.dao.VoteDao;
import com.cjg.domain.Vote;



public class VoteDaoImpl extends HibernateDaoSupport implements VoteDao {

	public void addVote(Vote vote) {
		getHibernateTemplate().save(vote);
	}

	@SuppressWarnings("unchecked")
	public Integer findIdByTitle(Vote vote) {
		String title = vote.getTitle();
		String sql = "from Vote as vote where vote.title=?";
		List<Vote> list = getHibernateTemplate().find(sql, title);
		return list.get(0).getVoteId();
	}
	
	@SuppressWarnings("unchecked")
	public List<Vote> findVote() {
		List<Vote> list = getHibernateTemplate().find("from Vote");
		return list;
	}

	@SuppressWarnings("unchecked")
	public Vote findVoteById(Integer voteId) {
		String sql = "from Vote as vote where vote.voteId=?";
		List<Vote> list = getHibernateTemplate().find(sql, voteId);
		return list.get(0);
	}

	public void updateVote(Vote vote) {
		getHibernateTemplate().saveOrUpdate(vote);
	}

	@SuppressWarnings("unchecked")
	public List<Vote> findVoteByTitle(Vote vote) {
		String title = vote.getTitle();
		String sql = "from Vote as vote where vote.title like '%" + title
				+ "%'";
		List<Vote> list = getHibernateTemplate().find(sql);
		if (list.size() > 0 && list != null) {
			return list;
		} else
			return null;
	}

	public Long findVoteCountByType(Integer type) {
		String sql = "select count(*) from Vote as vote where vote.type=?";
		List list = getHibernateTemplate().find(sql, type);
		if (list != null && list.size() > 0) {
			return (Long) list.get(0);
		} else
			return new Long(0);
	}

	public Long findVoteCount() {
		String sql = "select count(*) from Vote";
		List list = getHibernateTemplate().find(sql);
		if (list != null && list.size() > 0) {
			return (Long) list.get(0);
		} else
			return new Long(0);
	}
}
