package com.springBatch.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
	@Autowired
	private UserInterface userInterface;
	
	
	public void insertData(UserDetails details) {
		userInterface.save(details);
		
	}
	
	
	

}
