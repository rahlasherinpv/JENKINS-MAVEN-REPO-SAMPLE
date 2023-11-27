package com.training.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld hello=new HelloWorld();
		assertEquals(5, hello.addNumers(1, 4));
	}

}
