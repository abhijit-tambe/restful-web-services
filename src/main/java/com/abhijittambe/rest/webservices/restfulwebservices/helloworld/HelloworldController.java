package com.abhijittambe.rest.webservices.restfulwebservices.helloworld;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloworldController {

//	@Autowired
//	HelloWorldBean hb;
	
//	@GetMapping("/")
//	@RequestMapping(method =RequestMethod.GET ,path ="/")
	@GetMapping(path ="/")
	public String server() {
		return "Hello worlds";
	}
	
	
	@GetMapping(path ="/bean")
	public HelloWorldBean serverBean() {
//		hb.getName()
		return new HelloWorldBean("hb"); 
	}
	
	@GetMapping(path ="/bean/{na}")
	public HelloWorldBean serverBeanin(@PathVariable String na) {
//		hb.getName()
		return new HelloWorldBean(String.format("Hello world %s", na)); 
//		throw new RuntimeException("wut?");
	}
}
