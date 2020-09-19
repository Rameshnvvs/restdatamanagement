package com.data.mining.mine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MineApplication /*implements CommandLineRunner*/{
	
	public static void main(String[] args) {
		SpringApplication.run(MineApplication.class, args);
	}
	
	
	/*public void run(String ...args){
		jdbcTemplate.update("insert into department(dept,empId) values('Finance','12345')");
	}
*/
}
