package com.web.dao;

import com.web.model.Alien;
import java.sql.*;
public class AlienDao 
{
	public Alien getAlien(int aid)
	{
		Alien a= new Alien();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vinay","root","password");
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery("select* from alien where aid=" +aid);
			if(rs.next());
			{
			  a.setAid(rs.getInt("aid"));
			  a.setAname(rs.getString("aname"));
			  a.setTech(rs.getString("tech"));
			}
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		return a;
	}

}
