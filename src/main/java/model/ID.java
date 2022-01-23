package model;

public class ID {
	private int IDnum = 0;
	
	public int getID() {
		IDnum++;
		return IDnum;
	}
}
