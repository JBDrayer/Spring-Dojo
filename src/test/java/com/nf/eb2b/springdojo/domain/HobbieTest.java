package com.nf.eb2b.springdojo.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class HobbieTest {

	private StringBuilder content = new StringBuilder();
	private String hobbieName;

	@Test
	public void addsHobbieToContent() {
		hobbieName = "hobbie";
		
		Hobbie hobbie = new Hobbie(hobbieName);
		
		hobbie.addHobbieToContent(content);
		
		assertEquals(hobbieName, content.toString());
	}
}
