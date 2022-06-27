package com.chinu.demo;

import com.chinu.demo.dto.Users;
import com.chinu.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
        System.out.print("Hello World");
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	public UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		Users users= new Users();
		users.setId(3);
		users.setName("Bag");
		users.setPrice("1000");
		users.setQuantity(2);
		userRepo.save(users);

		Users users1= new Users();
		users1.setId(4);
		users1.setName("Jeans");
		users1.setPrice("2000");
		users1.setQuantity(2);
		userRepo.save(users1);
	}
}
