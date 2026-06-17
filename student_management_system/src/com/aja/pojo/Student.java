package com.aja.pojo;

public class Student {
	int sno;
	String sname;
	String semail;
	String sadd;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public Student(int sno, String sname, String semail, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.semail = semail;
		this.sadd = sadd;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
