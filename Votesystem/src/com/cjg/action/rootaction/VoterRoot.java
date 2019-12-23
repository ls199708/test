package com.cjg.action.rootaction;



import com.cjg.service.VoterService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class VoterRoot extends ActionSupport {
	protected VoterService voterService;
	protected String ip;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public VoterService getVoterService() {
		return voterService;
	}

	public void setVoterService(VoterService voterService) {
		this.voterService = voterService;
	}

}
