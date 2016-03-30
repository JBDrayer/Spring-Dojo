package springdojo.request;

import springdojo.domain.TeamMember;

public class SpringRequest {

	private TeamMember teamMember;

	public SpringRequest(TeamMember teamMember) {
		this.teamMember = teamMember;
	}

	public void introduceYourself(StringBuilder content) {
		introduceTeamMember(content);
	}

	public void introduceTeamMember(StringBuilder content) {
		teamMember.addGreetingToContent(content);
		teamMember.addNameToContent(content);
		teamMember.addTeamToContent(content);
		teamMember.addProgrammingLanguagesToContent(content);
		teamMember.addHobbiesToContent(content);
		teamMember.addFareWellToContent(content);
	}

}
