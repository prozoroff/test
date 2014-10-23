package com.echolot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class EchoRepositoryFake implements IEchoRepository {

	ArrayList<Echo> echoes = new ArrayList<Echo>();
	ArrayList<User> users = new UserRepositoryFake().getAll();
	
	public EchoRepositoryFake()
	{
		init();
	}
	
	private void init()
	{
		Echo jamesEcho1 = new Echo("http://some_hosting_address/jamesecho1", users.get(0), new Date());
		Echo jamesEcho2 = new Echo("http://some_hosting_address/jamesecho2", users.get(0), new Date());
		
		Echo robinEcho = new Echo("http://some_hosting_address/robinecho", users.get(2), new Date());
		robinEcho.addParent(jamesEcho2);
		
		echoes.add(jamesEcho1);
		echoes.add(jamesEcho2);
		echoes.add(robinEcho);
	}
	
	public ArrayList<Echo> getAll() {
		
		return echoes;
	}

	@Override
	public ArrayList<Echo> getByUser() {
		
		return null;
		
	}

}
