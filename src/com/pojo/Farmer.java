package com.pojo;

import java.io.InputStream;

public class Farmer {
	
	private int fid;
	
	private String uname;
	
	private String email;
	
	private String password;
	
	private String gender;
	
	private String phone;
	
	private String address;
	
	private InputStream inputStram;

	public Farmer() {
		super();
	}

	public Farmer(String uname, String email, String password, String gender, String phone, String address,
			InputStream inputStram) {
		super();
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.inputStram = inputStram;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public InputStream getInputStram() {
		return inputStram;
	}

	public void setInputStram(InputStream inputStram) {
		this.inputStram = inputStram;
	}
	
	
	
	

}
