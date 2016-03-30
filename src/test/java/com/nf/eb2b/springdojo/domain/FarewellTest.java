package com.nf.eb2b.springdojo.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class FarewellTest {

	private String phrase = "farewell";
	private StringBuilder content = new StringBuilder();

	@Test
	public void addsFarewellToContent() {
		Farewell farewell = new Farewell(phrase);
		
		farewell.addFarewellToContent(content );
		
		assertEquals(phrase, content.toString());
	}

}
