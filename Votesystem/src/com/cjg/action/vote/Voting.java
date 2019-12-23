package com.cjg.action.vote;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class Voting extends VoteContextRoot {

	@Override
	public String execute() throws Exception {
		Votecontext voteContext;
		String vc[] = context;
		for (int i = 0; i < vc.length; i++) {
			voteContext = new Votecontext();
			// 设置投票子选项编号
			voteContext.setVotecontextId(Integer.parseInt(vc[i]));
			// 由投票子选项编号查找对应系选项信息
			Votecontext votecontext2 = voteContextService
					.findVCCountByVCId(voteContext);
			Integer count = votecontext2.getCount();
			String vccontext = votecontext2.getContext();
			votecontext2.setContext(vccontext);
			// 当前投票子选项票数加一
			votecontext2.setCount(count + 1);
			voteContextService.updateVoteContext(votecontext2);
		}
		return SUCCESS;
	}

}
