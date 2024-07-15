package com.genericclassess.study;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private Integer stuId;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer stuId, String name) {
		super();
		this.stuId = stuId;
		this.name = name;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.stuId.compareTo(o.stuId);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, stuId);
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
		return Objects.equals(name, other.name) && Objects.equals(stuId, other.stuId);
	}
	
	

}
