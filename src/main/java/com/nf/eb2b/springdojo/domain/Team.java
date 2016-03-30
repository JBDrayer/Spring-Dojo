package com.nf.eb2b.springdojo.domain;

import java.util.HashMap;

import com.nf.eb2b.springdojo.enums.TeamEnum;

public class Team {

	private TeamEnum teamKey;
	private HashMap<TeamEnum, String> teamMap;

	public Team(TeamEnum teamKey, HashMap<TeamEnum, String> teamMap) {
		this.teamKey = teamKey;
		this.teamMap = teamMap;
	}

	public void addTeamToContent(StringBuilder content) {
		String team = teamMap.get(teamKey);
		content.append("I work on the "+ team + " team.");
	}

}
