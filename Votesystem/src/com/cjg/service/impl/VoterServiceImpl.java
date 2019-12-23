package com.cjg.service.impl;

import com.cjg.dao.VoterDao;
import com.cjg.domain.Voter;
import com.cjg.service.VoterService;


public class VoterServiceImpl implements VoterService {
	private VoterDao voterDao;

	public VoterDao getVoterDao() {
		return voterDao;
	}

	public void setVoterDao(VoterDao voterDao) {
		this.voterDao = voterDao;
	}

	public void addVoter(Voter voter) {
		voterDao.addVoter(voter);
	}

	public Voter findVoterByIp(String ip, Integer voteId) {
		return voterDao.findVoterByIp(ip, voteId);
	}

}
