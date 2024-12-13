package com.cjc.crud.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String LandingPage()
	{
		return "index";
	}
	@RequestMapping(value="/log")
	public String logPage()
	{
		return "login";
	}
	@RequestMapping(value="/login")
	public String loginPage(@RequestParam String uname,@RequestParam String pwd,Model m)
	{
		return "login";
	}
	
	
}
