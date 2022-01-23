package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserList implements Serializable{
	private List<User> userList = new ArrayList<>();
	
	
	public UserList() {
		User user = new User("あああ", "0000", 0);
		userList.add(user);
	}
	
	public void addUserList(User user) {
		userList.add(user);
	}
	
	public void getUserList() {
		for(int i=0;i<userList.size();i++) {
			System.out.println("ユーザー名："+userList.get(i).getName());
			System.out.println("パスワード："+userList.get(i).getPass());
			System.out.println("ＩＤ："+userList.get(i).getID());
			System.out.println();
		}
	}//いける？getUser(int i)のほうがいい？
	
	/*public boolean checkNewUser(User user) {
		if()
	}
	重複チェック　実装後回し
	*/
	
	public boolean checkLoginUser(User user) {
		boolean isUser = false;
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getName().equals(user.getName())||userList.get(i).getPass().equals(user.getPass())) {
				isUser = true;
			}
		}
		return isUser;
	}
	
	public User getUserID(User user) {
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getName().equals(user.getName())||userList.get(i).getPass().equals(user.getPass())) {
				String name = userList.get(i).getName();
				String pass = userList.get(i).getPass();
				int ID = userList.get(i).getID();
				user = new User(name, pass, ID);
			}
		}
		return user;
	}

}
