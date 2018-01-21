package user;

import java.util.Set;

public class User {
	private String userName;
	
	private Set<String> userAddressSet;
	
	private String userPhone;
	
	private String userId;
	
	
	public String getUserId() {
		return userId;
	}


	public User(String name, Set<String> address, String phone){
		this.userName = name;
		this.userAddressSet = address;		
		this.userPhone = phone;
	}

	
	public String getUserName() {
		return userName;
	}

	public Set<String> getUserAddressList() {
		return userAddressSet;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public boolean addUserAddress(String newAddress) {
		userAddressSet.add(newAddress);
		return true;
	}
}
