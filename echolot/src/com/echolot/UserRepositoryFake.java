package com.echolot;

import java.util.ArrayList;

public class UserRepositoryFake implements IUserRepository {

	public ArrayList<User> getAll() {
		
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(new User("james", "bond", "James Bond", "Agent 007"));
		users.add(new User("winnie", "pooh", "Winnie Pooh", ""));
		users.add(new User("robin", "hood", "Robin Hood", "British archer"));
		
		return users;
	}

	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

}
