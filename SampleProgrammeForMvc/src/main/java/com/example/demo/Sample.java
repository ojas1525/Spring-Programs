package com.example.demo;

import javax.xml.ws.ResponseWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sample {
	    
	    @ResponseBody
	    @RequestMapping("/")
	    
	    public String display() {
	        return "Venkatesh welcome to Ojas";
	    }
	}

