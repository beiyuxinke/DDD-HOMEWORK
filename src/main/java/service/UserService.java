package service;

import user.User;
import user.UserRepository;

public class UserService {
	UserRepository urp = new UserRepository();
	
	public boolean changeUserAddress(User user, String address){
		user.addUserAddress(address);
		return true;
	}
	
	public User findUser (String userId){		
		return urp.findUser(userId);
	}
	

	

}
