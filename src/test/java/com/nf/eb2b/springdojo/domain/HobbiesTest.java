package com.nf.eb2b.springdojo.domain;

import static org.junit.Assert.*;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class HobbiesTest {

	@Mock private Hobbie hobbieOne;
	@Mock private Hobbie hobbieTwo;
	@Mock private Hobbie hobbieThree;
	private StringBuilder content = new StringBuilder();
	private List<Hobbie> hobbieList;
	private Hobbies hobbies;
	private String hobbie = RandomStringUtils.randomAlphabetic(5);
	
	@Before
	public void configureHobbies(){
		hobbieList = Arrays.asList(hobbieOne, hobbieTwo, hobbieThree);
		addRandomStringToContent();
		hobbies = new Hobbies(hobbieList);
	}
	
	public void addRandomStringToContent() {
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				content.append(hobbie);
				return null;
			}
		}).when(hobbieOne).addHobbieToContent(content);
		
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				content.append(hobbie);
				return null;
			}
		}).when(hobbieTwo).addHobbieToContent(content);
		
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				content.append(hobbie);
				return null;
			}
		}).when(hobbieThree).addHobbieToContent(content);
	}
	
	@Test
	public void addsHobbiesToContent() {
		hobbies.addHobbiesToContent(content);
		
		verify(hobbieOne).addHobbieToContent(content);
		verify(hobbieTwo).addHobbieToContent(content);
	}
	
	@Test
	public void addsFormattedHobbiesToContent() throws Exception {
		String expected = "My hobbies include " + hobbie + ", " + hobbie + " and " + hobbie + ". ";
		
		hobbies.addHobbiesToContent(content);
		
		assertEquals(expected, content.toString());
	}
}
