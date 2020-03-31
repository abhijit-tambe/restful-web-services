package com.abhijittambe.rest.basicauth;

public class AuthenticationBean {
private String name ;

public AuthenticationBean(String name) {
	
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
