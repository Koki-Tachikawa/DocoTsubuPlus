package model;

import java.io.Serializable;

public class AdminUser implements Serializable{
	private String adminName = "たちかわ";
	private String adminPass = "0000";
	
	public AdminUser(){	}
	
	public String getAdminName() {
		return adminName;
	}
	public String getAdminPass() {
		return adminPass;
	}
	
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
}
