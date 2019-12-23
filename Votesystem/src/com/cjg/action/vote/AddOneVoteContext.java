package com.cjg.action.vote;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Votecontext;


@SuppressWarnings("serial")
public class AddOneVoteContext extends VoteContextRoot {
	@Override
	public String execute() throws Exception {
		Integer vid = voteId;
		Votecontext voteContext = new Votecontext();
		voteContext.setVoteId(vid);
		voteContext.setContext(getText("pleaseinputthecontextofnewvote"));
		voteContext.setCount(0);
		voteContextService.addOneVoteContext(voteContext);
		return SUCCESS;
	}
}
