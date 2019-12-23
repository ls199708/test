package com.cjg.action.vote;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class UpdateVoteContext extends VoteContextRoot {

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// 从session中获得list
		List<Votecontext> list = (List) session.getAttribute("list");
		for (int i = 0; i < context.length; i++) {
			Votecontext vc = new Votecontext();
			// 如果页面请求中投票子选项信息与list中的信息不符，说明有修改，
			// 将页面中信息更新到数据库，并将投票子选项票数信息更新为0
			if (!context[i].equals(list.get(i))) {
				vc.setContext(context[i]);
				vc.setCount(0);
				vc.setVoteId(list.get(i).getVoteId());
				vc.setVotecontextId(list.get(i).getVotecontextId());
				voteContextService.updateVoteContext(vc);
			} else
				return SUCCESS;
		}
		return SUCCESS;
	}
}
