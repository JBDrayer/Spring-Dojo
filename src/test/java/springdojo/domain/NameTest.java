package springdojo.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import springdojo.domain.Name;

public class NameTest {

	private String phrase = "name";
	private StringBuilder content = new StringBuilder();

	@Test
	public void addsNameToContent() {
		String expected ="My name is "+ phrase +"! ";
		Name name = new Name(phrase);
		
		name.addNameToContent(content);
					
		assertEquals(expected, content.toString());
	}
}
