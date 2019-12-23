package com.cjg.service;

import com.cjg.domain.Voter;

public interface VoterService {
	public void addVoter(Voter voter);
	
	public Voter findVoterByIp(String ip,Integer voteId);
}
