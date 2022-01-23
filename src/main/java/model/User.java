package model;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String pass;
	private int ID;
	
	public User(String name, String pass){
		this.name = name;
		this.pass = pass;
	}
	
	public User(String name, String pass, int ID){
		this.name = name;
		this.pass = pass;
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	public int getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
}
