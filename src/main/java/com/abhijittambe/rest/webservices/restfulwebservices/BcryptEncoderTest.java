package com.abhijittambe.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BCryptPasswordEncoder be= new BCryptPasswordEncoder();
		for(int i=0;i<10;i++) {
		String pass =be.encode("tambe");
		System.out.println(pass);
		}
	}

}
