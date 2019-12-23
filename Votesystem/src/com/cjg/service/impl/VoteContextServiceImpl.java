package com.cjg.service.impl;

import java.util.List;

import com.cjg.dao.VoteContextDao;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;
import com.cjg.service.VoteContextService;



public class VoteContextServiceImpl implements VoteContextService {
	VoteContextDao voteContextDao;

	public VoteContextDao getVoteContextDao() {
		return voteContextDao;
	}

	public void setVoteContextDao(VoteContextDao voteContextDao) {
		this.voteContextDao = voteContextDao;
	}

	public void addVoteContext(Votecontext voteContext) {
		voteContextDao.addVoteContext(voteContext);
	}

	public List<Votecontext> findVoteContextByVoteId(Vote vote) {
		return voteContextDao.findVoteContextByVoteId(vote);
	}

	public void delVoteContext(Votecontext voteContext) {
		voteContextDao.delVoteContext(voteContext);
	}

	public void addOneVoteContext(Votecontext voteContext) {
		voteContextDao.addOneVoteContext(voteContext);
	}

	public void updateVoteContext(Votecontext voteContext) {
		voteContextDao.updateVoteContext(voteContext);
	}

	public Votecontext findVCCountByVCId(Votecontext voteContext) {
		return voteContextDao.findVCCountByVCId(voteContext);
	}

	public Long findTotalCountByVoteId(Integer voteId) {
		return voteContextDao.findTotalCountByVoteId(voteId);
	}

}
