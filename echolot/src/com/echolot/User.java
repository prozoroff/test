package com.echolot;

import java.util.UUID;

public class User {
	
	public UUID Id;
	
	public String Login;
	public String Password;
	
	public String Name;
	public String Description;
	
	public User(String login, String password, String name, String description)
	{
		Id = UUID.randomUUID();
		Login = login;
		Password = password;
		Name = name;
		Description = description;
	}
	
	public User(){}
	
	@Override
	public String toString()
	{
		return new String().concat(Name).concat(Description!=""?" ":"").concat(Description);
	}
}
