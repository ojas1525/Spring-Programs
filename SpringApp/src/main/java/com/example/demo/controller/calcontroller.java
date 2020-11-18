package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calcontroller {
	
	
	    
	    @ResponseBody
	    @RequestMapping("/")
	    
	    public String display() {
	        return "venkatesh";
	    }

	 

	}


