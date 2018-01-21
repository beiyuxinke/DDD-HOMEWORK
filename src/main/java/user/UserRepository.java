package user;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

	public UserRepository(){
		
	}
	
	public User findUser(String userId){
		if(userMap.isEmpty()){
			return null;
		}
		return userMap.get(userId);
	}
	
	public User User(String userId){
		if(userMap.isEmpty()){
			return null;
		}
		return userMap.get(userId);
	}
	
	public boolean saveUser(User user){
		if(null==user){
			return false;
		}
		
		try{
			userMap.put(user.getUserId(), user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	

	private static volatile Map<String, User> userMap = new HashMap<String, User>();

}
