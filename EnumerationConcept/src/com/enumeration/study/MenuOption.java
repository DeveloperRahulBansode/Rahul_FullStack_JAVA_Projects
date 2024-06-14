package com.enumeration.study;

public enum MenuOption {

	ADD(1, "Add Record"), 
	UPDATE(2, "Update Record"), 
	SELECT(3, "Select Record"), 
	SELECT_ALL(4, "SelectAll Record"),
	DELETE(5, "Delete Record"), 
	EXIT(0, "Exit The ");

	private int srNo;
	private String menuDescreption;

	private MenuOption(int srNo, String menuDescreption) {
		this.srNo = srNo;
		this.menuDescreption = menuDescreption;

	}

	public int getSrNo() {
		return srNo;
	}

	public String getMenuDescreption() {
		return menuDescreption;
	}

}
