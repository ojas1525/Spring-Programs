package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

 
@SpringBootApplication
public class ExampleProjectApplication implements CommandLineRunner{
    @Autowired(required=true)
    private JdbcTemplate jdtJdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(ExampleProjectApplication.class, args);
        
    }
    
    public void createTable() {
        jdtJdbcTemplate.update("create table cusrtomer(cno int primary key, cname varchar(20))");
        System.out.println("Table is created");
    }
    public void addStudentRecord() {
        int count = jdtJdbcTemplate.update("insert into cusrtomer values(?,?)",9,"venky");
        System.out.println("Data is Inserted "+count);
    }
    public void updateStudentRecord() {
    	int count = jdtJdbcTemplate.update("update cusrtomer set cname=? where cno=9","venkatesh");
    	System.out.println("Data is Updated " +count);
    }
  
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        //createTable();
        //addStudentRecord();
    	//updateStudentRecord();
        
        
    }

 

}