package com.echolot;

import java.util.ArrayList;

public interface IUserRepository {

	ArrayList<User> getAll();
	void shutdown();
}
