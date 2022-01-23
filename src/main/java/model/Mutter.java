package model;

import java.io.Serializable;

public class Mutter implements Serializable{
	private String userName;
	private String text;
	
	public Mutter(String userName, String text){
		this.userName = userName;
		this.text = text;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getText() {
		return text;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void set(String text) {
		this.text = text;
	}
}
