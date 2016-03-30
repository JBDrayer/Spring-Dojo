package com.nf.eb2b.springdojo.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	private StringBuilder content = new StringBuilder();
	String phrase = "greeting";

	@Test
	public void addsGreetingToContent() {
		String expected = "greeting. ";
		Greeting greeting = new Greeting(phrase);

		greeting.addGreetingToContent(content);
		assertEquals(expected, content.toString());
	}

}
