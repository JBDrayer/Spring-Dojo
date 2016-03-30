package springdojo.domain;

public class TeamMember {

	private Greeting greeting;
	private Name name;
	private Team team;
	private ProgrammingLanguages programmingLanguages;
	private Hobbies hobbies;
	private Farewell farewell;

	public TeamMember(Greeting greeting, Name name, Team team, ProgrammingLanguages programmingLanguages, Hobbies hobbies, Farewell farewell) {
		this.greeting = greeting;
		this.name = name;
		this.team = team;
		this.programmingLanguages = programmingLanguages;
		this.hobbies = hobbies;
		this.farewell = farewell;
	}

	public void addGreetingToContent(StringBuilder content) {
		greeting.addGreetingToContent(content);
	}

	public void addNameToContent(StringBuilder content) {
		name.addNameToContent(content);
	}

	public void addTeamToContent(StringBuilder content) {
		team.addTeamToContent(content);
	}

	public void addProgrammingLanguagesToContent(StringBuilder content) {
		programmingLanguages.addLanguagesToContent(content);
	}

	public void addHobbiesToContent(StringBuilder content) {
		hobbies.addHobbiesToContent(content);
	}

	public void addFareWellToContent(StringBuilder content) {
		farewell.addFarewellToContent(content);
	}

}
