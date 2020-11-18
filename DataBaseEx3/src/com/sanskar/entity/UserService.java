package com.sanskar.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.config.Config;

public class UserService {
	
	
	private Connection conn;
	
	public UserService() throws ClassNotFoundException, SQLException
	{
		conn = Config.connectMySQL();
	}
	
	public void saveUser(User user) throws Exception
	{
		String query = String.format("INSERT INTO userdata(userid,fname,mname,lname,age,city)VALUES(%d,'%s','%s','%s',%d,'%s')", user.getUserid(),user.getFname(),user.getMname(),user.getLname(),user.getAge(),user.getCity());
		
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		
		System.out.println("Save Succesfully");
	}
	
	public void updateUser(User user)throws Exception
	{
		String query = String.format("UPDATE userdata SET fname = '%s',mname='%s',lname ='%s',age=%d,city='%s' WHERE userid=%d  ",user.getFname(),user.getMname(),user.getLname(),user.getAge(),user.getCity(),user.getUserid() );
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("Updated Successfully");
	}
	
	public void deleteUser(User user)throws Exception
	{
		String query = String.format("DELETE FROM userdata WHERE userid = %d", user.getUserid());
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		System.out.println("Deleted Successfully");
	}

}
