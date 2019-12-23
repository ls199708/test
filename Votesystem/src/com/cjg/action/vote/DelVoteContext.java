package com.cjg.action.vote;

import java.util.List;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class DelVoteContext extends VoteContextRoot {
	private static final String DELCONTEXTERROR = "delContextError";

	@Override
	public String execute() throws Exception {
		Vote vote = new Vote();
		vote.setVoteId(voteId);
		// 通过投票ID查找投票选项信息并封装到list
		List<Votecontext> list = voteContextService
				.findVoteContextByVoteId(vote);
		System.out.println("==========" + list.size());
		// 如果对应某投票ID的投票选项数小于或等于2则不可继续删除
		if (list.size() > 2) {
			Votecontext voteContext = new Votecontext();
			voteContext.setVotecontextId(votecontextId);
			voteContextService.delVoteContext(voteContext);
			return SUCCESS;
		} else {
			addActionError(getText("lessthantwo"));
			return DELCONTEXTERROR;
		}
	}
}
