package com.mapinterface.study;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int stuId;
	private String stuName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(stuId, stuName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stuId == other.stuId && Objects.equals(stuName, other.stuName);
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	@Override
	public int compareTo(Student o) {
		return Integer.compare(stuId, o.stuId);
	}
	
	
	
	
	

}
