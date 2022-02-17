package com.pojo;

import java.io.InputStream;
import java.sql.Date;

public class Product {

	private int pid;
	
	private String ptype;
	
	private String pname;
	
	private int qavailable;
	
	private double ppkg;
	
	private String email;
	
	private InputStream inputStream;
	
	private Date sqlDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

	public Product(String ptype, String pname, int qavailable, double ppkg, InputStream inputStream,String email,Date sqlDate) {
		super();
		
		this.ptype = ptype;
		this.pname = pname;
		this.qavailable = qavailable;
		this.ppkg = ppkg;
		this.inputStream = inputStream;
		this.email=email;
		this.sqlDate=sqlDate;
	}

	public Product(int pid,String ptype, String pname, int qavailable, double ppkg, InputStream inputStream,String email,Date sqlDate) {
		super();
		this.pid=pid;
		this.ptype = ptype;
		this.pname = pname;
		this.qavailable = qavailable;
		this.ppkg = ppkg;
		this.inputStream = inputStream;
		this.email=email;
		this.sqlDate=sqlDate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQavailable() {
		return qavailable;
	}

	public void setQavailable(int qavailable) {
		this.qavailable = qavailable;
	}

	public double getPpkg() {
		return ppkg;
	}

	public void setPpkg(double ppkg) {
		this.ppkg = ppkg;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getSqlDate() {
		return sqlDate;
	}

	public void setSqlDate(Date sqlDate) {
		this.sqlDate = sqlDate;
	}
	
}
