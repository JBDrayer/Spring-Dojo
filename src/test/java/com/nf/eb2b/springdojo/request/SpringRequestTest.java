package com.nf.eb2b.springdojo.request;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.nf.eb2b.springdojo.domain.TeamMember;

@RunWith(MockitoJUnitRunner.class)
public class SpringRequestTest {

	@Mock private TeamMember teamMember;
	private StringBuilder content;
	private SpringRequest request;

	@Before
	public void configureRequest() {
		request = new SpringRequest(teamMember);
		request.introduceYourself(content);
	}
	
	@Test
	public void teamMemberAddsGreetsingToContent() {
		verify(teamMember).addGreetingToContent(content);
	}

	@Test
	public void teamMemberAddsNameToContent() throws Exception {		
		verify(teamMember).addNameToContent(content);
	}
	
	@Test
	public void teamMemberAddsTeamToContent() throws Exception {
		verify(teamMember).addTeamToContent(content);
	}

	@Test
	public void teamMemberAddsProgrammingLanguagesToContent() throws Exception {
		verify(teamMember).addProgrammingLanguagesToContent(content);
	}
	
	@Test
	public void teamMemberAddsHobbiesToContent() throws Exception {
		verify(teamMember).addHobbiesToContent(content);
	}
	
	@Test
	public void teamMemberAddsFarewellToContent() throws Exception {
		verify(teamMember).addFareWellToContent(content);
	}
}