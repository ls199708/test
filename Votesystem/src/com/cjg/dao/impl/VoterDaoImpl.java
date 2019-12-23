package com.cjg.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cjg.dao.VoterDao;
import com.cjg.domain.Voter;



public class VoterDaoImpl extends HibernateDaoSupport implements VoterDao {

	public void addVoter(Voter voter) {
		getHibernateTemplate().save(voter);
	}

	@SuppressWarnings("unchecked")
	public Voter findVoterByIp(String ip, Integer voteId) {
		Object param[] = { ip, new Integer(voteId) };
		String sql = "from Voter as voter where voter.ip=? and voter.voteId=?";
		List<Voter> list = getHibernateTemplate().find(sql, param);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

}
