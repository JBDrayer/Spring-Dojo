package com.nf.eb2b.springdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpringDojoE2ETest {

	private StringBuilder content = new StringBuilder();

	@Test
	public void IntroduceUsToBrad() {
		String expected = "Hi. My name is Brad! I work on the build team." +
							"I know how to write Java, Javascript, C++ and C# code. " +
							"My hobbies include playing videogames, building electronics " +
							"and playing bass guitar. Thanks for running my context!";
		SpringDojo dojo = new SpringDojo(content);
		
		dojo.introduceYourself();
		
		assertEquals(expected, content.toString());
	}

}
