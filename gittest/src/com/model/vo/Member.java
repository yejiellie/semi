package com.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String mamberName;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String memberPwd, String mamberName) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.mamberName = mamberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMamberName() {
		return mamberName;
	}

	public void setMamberName(String mamberName) {
		this.mamberName = mamberName;
	}
	
	
}
