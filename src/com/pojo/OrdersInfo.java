package com.pojo;

public class OrdersInfo {

	private int oid;
	
	private String email;
	
	private int pid;
	
	private String femail;

	public OrdersInfo() {
		super();
	}

	public OrdersInfo(int oid, String email, int pid,String femail) {
		super();
		this.oid = oid;
		this.email = email;
		this.pid = pid;
		this.femail=femail;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFemail() {
		return femail;
	}

	public void setFemail(String femail) {
		this.femail = femail;
	}
	
	
}
