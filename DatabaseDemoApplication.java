package com.dream.database.databasedemo;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dream.database.databasedemo.entity.Person;
import com.dream.database.databasedemo.jdbc.PersonJdbcDao;



@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{
	
	private Logger logger=LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All Users ->{} ",personJdbcDao.findAll());
		logger.info("User id -1001>{} ",personJdbcDao.findById(1001));
		logger.info("Delete user id -1003>{} ",personJdbcDao.deleteById(1003));
		logger.info("Insert user id -1005>{} ",personJdbcDao.insert(new Person(1005, "Mantu", "Howrah", new Date())));
		logger.info("Insert user id -1004>{} ",personJdbcDao.update(new Person(1004, "Tom", "Germany", new Date())));
		
	}

}
