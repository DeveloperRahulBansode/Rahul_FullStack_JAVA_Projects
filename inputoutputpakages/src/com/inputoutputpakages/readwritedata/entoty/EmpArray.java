package com.inputoutputpakages.readwritedata.entoty;

import java.io.Serializable;

public class EmpArray implements Serializable {
	private int inpId;
	private String name;
	public EmpArray(int inpId, String name) {
		super();
		this.inpId = inpId;
		this.name = name;
	}
	public int getInpId() {
		return inpId;
	}
	public void setInpId(int inpId) {
		this.inpId = inpId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmpArray [inpId=" + inpId + ", name=" + name + "]";
	}
	

}