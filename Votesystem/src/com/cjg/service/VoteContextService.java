package com.cjg.service;

import java.util.List;

import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;



public interface VoteContextService {
	public void addVoteContext(Votecontext voteContext);

	public List<Votecontext> findVoteContextByVoteId(Vote vote);

	public void delVoteContext(Votecontext voteContext);

	public void addOneVoteContext(Votecontext voteContext);

	public void updateVoteContext(Votecontext voteContext);
	
	public Votecontext findVCCountByVCId(Votecontext voteContext);
	
	public Long findTotalCountByVoteId(Integer voteId);
	
}
