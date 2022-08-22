package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int cid;
	private String cname;
	private int cno;
//	private String caddress;
//	private String clogin;
//	private String cpass;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	
	@Override
	public String toString() 
	{
		return "Customer [cid=" + cid + ", cname=" + cname + ", cno=" + cno + "]";
	}

}
