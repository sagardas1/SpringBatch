package com.springBatch.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contrl")
public class Demo {
	@Autowired
	private ServiceLayer serviceLayer;
	
	@GetMapping(value="/{name}",headers="Accept=application/json")
	public String getname(@PathVariable String name) {
		return name;
	}
	@PostMapping(value="/insert",headers="Accept=application/json")
	public String insertData(@RequestBody UserDetails details) {
		serviceLayer.insertData(details);
		return null;
	}

}
