package com.chinu.demo;

import com.chinu.demo.dto.Users;
import com.chinu.demo.repository.UserRepo;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserRepo uRepo;

	@Test
	public void testUserRepo() {
		Users users = new Users();
		users.setId(1);
		users.setName("TubeTop");
		users.setQuantity(2);
		users.setPrice("1500");
		uRepo.save(users);
		assertNotNull(uRepo.findById(1).get());
	}
	@Test
	public void testReadAllUser() {
		List<Users> usersList=uRepo.findAll();
		assertThat(usersList).size().isGreaterThan(0);
	}

	@Test
	public void testSingleUser() {
		Users users=uRepo.findById(1).get();
		assertEquals("1500.0",users.getPrice());
	}

}
