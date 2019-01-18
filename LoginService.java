package com.st.fdcMapping.login;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private	ArrayList<Login> login=new ArrayList<>(Arrays.asList(new Login("hbj","nbj"),
    		                                                new Login("dsvcdsvd","vfdsvd")));
	public ArrayList<Login> getAllDetails()
	{
		
		return login;
	}
	
	public Login getDetailsByUser(String user)
	{
		
		return login.stream().filter(t->t.getUserName().equals(user)).findFirst().get();
	}
	
	public ArrayList<Login> addUserDetails(Login user)
	{
		login.add(user);
		return login;
	}
	
	public ArrayList<Login> updateUserDetails(Login logg,String user)
	{
		login.stream().filter(t->t.getUserName().equals(logg.getUserName())).forEach(t->t.setPassword(logg.getPassword()));
return login;
		}
	
	public ArrayList<Login> deleteUserDetails(String user)
	{
		login.removeIf(t->t.getUserName().equals(user));
		return login;
	}
}
