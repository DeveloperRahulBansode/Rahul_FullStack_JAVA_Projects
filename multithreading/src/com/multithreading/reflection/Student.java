package com.multithreading.reflection;

public class Student {
	
	private Integer stuId;
	private String stuNname;
	public Student(int stuId, String stuNname) {
		super();
		this.stuId = stuId;
		this.stuNname = stuNname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuNname() {
		return stuNname;
	}
	public void setStuNname(String stuNname) {
		this.stuNname = stuNname;
	}
	
	
	private String toString1(Integer Id,String name) {
		this.stuId=Id;
		this.stuNname=name;
		return "StudentId="+Id+" "+"StudentName="+name;
		
	}
	
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuNname=" + stuNname + "]";
	}
	
	

}
