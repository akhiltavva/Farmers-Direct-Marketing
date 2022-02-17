package com.pojo;

import java.io.InputStream;

public class Vendor {

    private int vid;
	
	private String uname;
	
	private String email;
	
	private String password;
	
	private String gender;
	
	private String phone;
	

	private String address;
	
	private InputStream inputStream;
	
	public Vendor()
	{
		
	}

	public Vendor(String uname, String email, String password, String gender, String phone, String address,InputStream inputStream) {
		super();
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.inputStream = inputStream;
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

	public InputStream getInputSteram() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public InputStream getInputStream() {
		return inputStream;
	}
	

}
