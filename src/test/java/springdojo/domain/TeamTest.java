package springdojo.domain;

import static org.junit.Assert.*;
import static springdojo.enums.TeamEnum.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import springdojo.domain.Team;
import springdojo.enums.TeamEnum;

public class TeamTest {

	private StringBuilder content = new StringBuilder();
	private TeamEnum buildTeamKey = BUILD;
	private TeamEnum runTeamKey = RUN;
	private HashMap<TeamEnum, String> teamMap = new HashMap<TeamEnum, String>();
	private Team team;

	
	@Before
	public void configureTeamMap(){
		teamMap.put(BUILD, "build");
		teamMap.put(RUN, "run");
	
	}
	
	@Test
	public void addsBuildTeamToContent() {
		String expected = "I work on the build team.";
		team = new Team(buildTeamKey,teamMap);
		
		team.addTeamToContent(content);
		
		assertEquals(expected, content.toString());
	}
	
	@Test
	public void addsRunTeamToContent() throws Exception {
		String expected = "I work on the run team.";
		team = new Team(runTeamKey ,teamMap);

		team.addTeamToContent(content);
		
		assertEquals(expected, content.toString());
	}
}
