package springdojo.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import springdojo.domain.Greeting;

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
