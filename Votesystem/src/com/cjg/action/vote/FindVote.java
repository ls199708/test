package com.cjg.action.vote;

import java.util.ArrayList;
import java.util.List;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Admin;
import com.cjg.domain.Vote;
import com.cjg.domain.VoteInfo;

@SuppressWarnings("serial")
public class FindVote extends VoteRoot {
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		List<Vote> list = new ArrayList();
		// 查出所有投票信息并赋给list
		list = voteService.findVote();
		list2 = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			// 取出对应某条投票信息的管理员编号，由管理员编号查出管理员用户名并封装到admin对象中
			Admin admin = adminService.findNameById(list.get(i).getAdminId());
			VoteInfo vInfo = new VoteInfo();
			// 如果投票信息中publish==1，显示投票状态为开放
			if (list.get(i).getPublish() == 1)
				vInfo.setPublish(getText("open"));
			else
				vInfo.setPublish(getText("close"));
			// 如果投票信息中type==1，显示投票类型为单选
			if (list.get(i).getType() == 1)
				vInfo.setType(getText("singgleselect"));
			else
				vInfo.setType(getText("multiselect"));
			vInfo.setAdminname(admin.getName());
			vInfo.setCreatedate(list.get(i).getCreatedate());
			vInfo.setTitle(list.get(i).getTitle());
			vInfo.setVoteId(list.get(i).getVoteId());
			// 将查找出的投票信息封装到list2
			list2.add(vInfo);
		}
		setList2(list2);
		return SUCCESS;
	}
}
