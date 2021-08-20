package com.example.jpa.Jpademo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepo dao;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}
//in jdbc you have to define the table into the H2 databse but in jpa it is not requires
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("all users->{}",dao.findAll());
			logger.info("all users->{}",dao.findAll());
				logger.info("inserting 1009->{}",dao.insert(new Person(1010,"tara","berlin",new Date())));
	logger.info("inserting 1009->{}",dao.insert(new Person(1010,"tara","berlin",new Date())));
	logger.info("update 1003->{}",dao.update(new Person(1003,"pari","berlin",new Date())));
gsiuhdilahskjjfhkdsfd
	logger.info("user id 1001->{}",dao.findById(1001));
	logger.info("user id 1001->{}",dao.findById(1001));
	//logger.info("user id 1002->{}",dao.deleteById(1002));
		dao.deleteById(1002);
//		//System.out.print(dao.findAll());
	logger.info("inserting 1009->{}",dao.insert(new Person(1010,"tara","berlin",new Date())));
	logger.info("inserting 1009->{}",dao.insert(new Person(1010,"tara","berlin",new Date())));
	logger.info("update 1003->{}",dao.update(new Person(1003,"pari","berlin",new Date())));
	shagjsagudsakujjhdkshckdscd
//	
		
	}

}
