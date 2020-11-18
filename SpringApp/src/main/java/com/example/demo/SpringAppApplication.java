package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Bean.Student;

@SpringBootApplication
public class SpringAppApplication {
	
	 static ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringAppApplication.class, args);
	    System.out.println("welcome"+ctx);
	    Student s = (Student)ctx.getBean("student");
	    s.setSno(11);
	    s.setSname("venkatesh");
	    s.disp();
	}

}
