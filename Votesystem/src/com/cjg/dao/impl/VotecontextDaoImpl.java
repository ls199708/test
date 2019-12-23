package com.cjg.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cjg.dao.VoteContextDao;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;



public class VotecontextDaoImpl extends HibernateDaoSupport implements
		VoteContextDao {

	public void addVoteContext(Votecontext voteContext) {
		getHibernateTemplate().save(voteContext);
	}

	@SuppressWarnings("unchecked")
	public List findVoteContextByVoteId(Vote vote) {
		Integer vote_id = vote.getVoteId();
		String sql = "from Votecontext as voteContext where voteContext.voteId=?";
		List<Votecontext> list = getHibernateTemplate().find(sql, vote_id);
		return list;
	}

	public void delVoteContext(Votecontext voteContext) {
		getHibernateTemplate().delete(voteContext);
	}

	public void addOneVoteContext(Votecontext voteContext) {
		getHibernateTemplate().save(voteContext);
	}

	public void updateVoteContext(Votecontext voteContext) {
		getHibernateTemplate().saveOrUpdate("voteContextId", voteContext);
	}

	@SuppressWarnings("unchecked")
	public Votecontext findVCCountByVCId(Votecontext voteContext) {
		Integer vcId = voteContext.getVotecontextId();
		String sql = "from Votecontext as voteContext where voteContext.votecontextId=?";
		List<Votecontext> list = getHibernateTemplate().find(sql, vcId);
		return list.get(0);
	}

	public Long findTotalCountByVoteId(Integer voteId) {
		String sql = "select sum(voteContext.count) from Votecontext as voteContext where voteContext.voteId=?";
		List list = getHibernateTemplate().find(sql, voteId);
		return (Long) list.get(0);
	}
}
