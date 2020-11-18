package com.sanskar.entity;

public class User {
	
	private int userid;
	private String fname;
	private String mname;
	private String lname;
	private int age;
	private String city;
	
	public User() {}
	
	public User(int userid, String fname, String mname, String lname, int age, String city) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", age=" + age
				+ ", city=" + city + "]";
	}

	public int getUserid() {
		return userid;
	}

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
	
	
}
