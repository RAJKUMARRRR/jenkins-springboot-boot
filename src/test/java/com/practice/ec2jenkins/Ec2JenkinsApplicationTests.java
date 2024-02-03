package com.practice.ec2jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ec2JenkinsApplicationTests {

	@Autowired
	DemoController demoController;
	@Test
	void successTest() {
		assertEquals("Congratulations, application deployed",demoController.hello());
	}

}
