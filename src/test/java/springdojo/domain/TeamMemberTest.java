package springdojo.domain;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import springdojo.domain.Farewell;
import springdojo.domain.Greeting;
import springdojo.domain.Hobbies;
import springdojo.domain.Name;
import springdojo.domain.ProgrammingLanguages;
import springdojo.domain.Team;
import springdojo.domain.TeamMember;

@RunWith(MockitoJUnitRunner.class)
public class TeamMemberTest {

	@Mock private Team team;
	@Mock private ProgrammingLanguages programmingLanguages;
	@Mock private Hobbies hobbies;
	@Mock private Greeting greeting;
	@Mock private Name name;
	@Mock private Farewell farewell;
	private StringBuilder content = new StringBuilder();
	private TeamMember teamMember;

	@Before
	public void configureTeamMember() {
		teamMember = new TeamMember(greeting, name, team, programmingLanguages, hobbies, farewell);
	}
	
	@Test
	public void addsGreetingToContent() {
		teamMember.addGreetingToContent(content);
		
		verify(greeting).addGreetingToContent(content);
	}
	
	@Test
	public void addsNameToContent() throws Exception {
		teamMember.addNameToContent(content);
		
		verify(name).addNameToContent(content);
	}
	
	@Test
	public void addsTeamToContent() throws Exception {
		teamMember.addTeamToContent(content);
		
		verify(team).addTeamToContent(content);
	}
	
	@Test
	public void addsProgrammingLanguagesToContent() throws Exception {
		teamMember.addProgrammingLanguagesToContent(content);
		
		verify(programmingLanguages).addLanguagesToContent(content);
	}
	
	@Test
	public void addsHobbiesToContent() throws Exception {
		teamMember.addHobbiesToContent(content);
		
		verify(hobbies).addHobbiesToContent(content);
	}
	
	@Test
	public void addsFareWellToContent() throws Exception {
		teamMember.addFareWellToContent(content);
		
		verify(farewell).addFarewellToContent(content);
	}
}


