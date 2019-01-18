package com.st.fdcMapping.login;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping("/login")  //http://localhost:8080/login
	public String getdetails()
	{
		return "Hi";
	}
	
	@RequestMapping("/loginDetails")
	public ArrayList<Login> getlogindetails()  //http://localhost:8080/loginDetails
	{
		LoginService loginService=new LoginService();
		return loginService.getAllDetails();
	}
	
	
	
	
	@RequestMapping("/loginDetails/{user}")
	public Login getLoginDetailsByUser(@PathVariable String user)  //http://localhost:8080/loginDetails/hbj
	{
		LoginService loginService=new LoginService();
		return loginService.getDetailsByUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addlogin")
	public ArrayList<Login> addNewUser(@RequestBody Login login)  //http://localhost:8080/addlogin 
	{
		LoginService loginService=new LoginService();
		return loginService.addUserDetails(login); 
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updatelogin/{user}")
	public ArrayList<Login> updateUser(@RequestBody Login login,@PathVariable String user)  //http://localhost:8080/addlogin 
	{
		LoginService loginService=new LoginService();
		return loginService.updateUserDetails(login,user); 
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deletelogin/{user}")
	public ArrayList<Login> deleteUser(@PathVariable String user)  //http://localhost:8080/addlogin 
	{
		LoginService loginService=new LoginService();
		return loginService.deleteUserDetails(user); 
	}
}
