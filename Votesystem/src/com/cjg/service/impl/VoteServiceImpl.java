package com.cjg.service.impl;

import java.util.List;

import com.cjg.dao.VoteDao;
import com.cjg.domain.Vote;
import com.cjg.service.VoteService;



public class VoteServiceImpl implements VoteService {
	private VoteDao voteDao;

	public VoteDao getVoteDao() {
		return voteDao;
	}

	public void setVoteDao(VoteDao voteDao) {
		this.voteDao = voteDao;
	}

	public void addVote(Vote vote) {
		voteDao.addVote(vote);
	}

	public Integer findIdByTitle(Vote vote) {
		return voteDao.findIdByTitle(vote);
	}

	public List<Vote> findVote() {
		return voteDao.findVote();
	}

	public Vote findVoteById(Integer voteId) {
		return voteDao.findVoteById(voteId);
	}

	public void updateVote(Vote vote) {
		voteDao.updateVote(vote);
	}

	public List<Vote> findVoteByTitle(Vote vote) {
		return voteDao.findVoteByTitle(vote);
	}

	public Long findVoteCount() {
		return voteDao.findVoteCount();
	}

	public Long findVoteCountByType(Integer type) {
		return voteDao.findVoteCountByType(type);
	}

}
