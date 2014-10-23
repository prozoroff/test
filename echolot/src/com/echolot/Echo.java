package com.echolot;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Echo {
	
	public UUID Id;
	
	public String SoundUrl;
	
	public User User;
	public Date Datetime;
	public Echo Parent;
	public ArrayList<Echo> Children;
	
	public Echo(String soundUrl, User user, Date datetime)
	{
		Id = UUID.randomUUID();
		SoundUrl = soundUrl;
		User = user;
		Datetime = datetime;
		Parent = null;
		Children = new ArrayList<Echo>();
	}
	
	public Echo(){}
	
	public void addParent(Echo parent)
	{
		Parent = parent;
		parent.Children.add(this);
	}
	
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder().append(User.Name).append(": ").append(SoundUrl);
		
		if(Children.size()>0)
		{
			result.append("Children: ");
			for(int i = 0; i < Children.size(); i++) result.append(Children.get(i).toString());
		}
		
		return result.toString();
	}
}