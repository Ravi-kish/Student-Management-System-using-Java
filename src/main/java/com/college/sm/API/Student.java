package com.college.sm.API;

public class Student {

	private int srNo;
	private Integer id;
	private String name;
	private Long mobile;
	private String email;;
	private String branch;
	
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [srNo=" + srNo + ", id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email
				+ ", branch=" + branch + "]";
	}
	
	

	

	
}
