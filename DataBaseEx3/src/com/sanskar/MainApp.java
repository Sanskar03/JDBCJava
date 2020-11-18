package com.sanskar;

import com.sanskar.entity.User;
import com.sanskar.entity.UserService;

public class MainApp {

	public static void main(String[] args) {
		
		User obj1 = new User(101,"Sanskar","Ganpat","Hake",20,"Sangli");
		
		try {
			UserService uservice = new UserService();
			
			//uservice.saveUser(obj1);
			
			//uservice.updateUser(obj1);
			
			uservice.deleteUser(obj1);
		} catch (Exception e) {
			System.out.println("Exception is " + e);
		}
	}

}
