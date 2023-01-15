package com.bookreader.utils;

import java.util.HashMap;

import com.bookreader.beans.User;

public class UserManager {

	private HashMap<Integer, User> users;
	
	public UserManager() {
		users = new HashMap<>();
	}
	
	public boolean addUser(int id, String name){
		//logic for adding use in the collection
		if(users.containsKey(id)) {
			return false;
		}
		User user = new User(id, name);
		users.put(id, user);
		return true;
	}
	
	public boolean addUser(User user) {
		if(users.containsKey(user.getId())) {
			//throw UserAlreadyExistException
			return false;
		}
		users.put(user.getId(), user);
		return true;
	}
	
	public boolean removeUser(int id) {
		if(!users.containsKey(id)) {
			// throw UserNotAvailableException
			return false;
		}
		users.remove(id);
		return true;
	}
	
	//Get the user from collection (Map)
	public User findUser(int id) {
		if(!users.containsKey(id)) {
			// throw UserNotAvailableException
			return null;
		}
		return users.get(id);
	}
}
