package model;

public class ID {
	private int IDnum = 0;
	String name;
	
	public int getID() {
		IDnum++;
		return IDnum;
	}
}
