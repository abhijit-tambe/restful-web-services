package com.abhijittambe.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
private String name ;

public HelloWorldBean(String name) {
	
	this.name = name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return String.format("HelloWorldBean [name=%s]", name);
}

public String getName() {
	return name;
}

}
