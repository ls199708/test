package com.cjg.service;

import java.util.List;

import com.cjg.domain.Vote;



public interface VoteService {
	public void addVote(Vote vote);

	public Integer findIdByTitle(Vote vote);

	public List<Vote> findVote();

	public Vote findVoteById(Integer voteId);
	
	public void updateVote(Vote vote);
	
	public List<Vote> findVoteByTitle(Vote vote);
	
	public Long findVoteCountByType(Integer type);
	
	public Long findVoteCount();
}
