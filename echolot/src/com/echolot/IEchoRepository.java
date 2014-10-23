package com.echolot;

import java.util.ArrayList;

public interface IEchoRepository {
	
	ArrayList<Echo> getAll();
	ArrayList<Echo> getByUser();
	
}
