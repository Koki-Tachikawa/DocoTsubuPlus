package model;
//これいる？
import java.util.List;

public class UserLogic {
	public List<User> execute(List<User> userList, User user){
		userList.add(user);
		return userList;
	}
}
