package com.khs.sports.service;

import java.util.Map;
import java.util.Map.Entry;

import com.khs.sports.model.SportsTeam;

public class MapBasedSportsService implements SportsService {

	private Map<Integer, SportsTeam> teams;
	
	public MapBasedSportsService(Map<Integer, SportsTeam> teams) {
		this.teams = teams;
	}

	@Override
	public void displayTeams() {
		for (Entry<Integer, SportsTeam> entry : teams.entrySet()) {
			SportsTeam team = entry.getValue();
			System.out.print(entry.getKey() + ". The " + team.getHostCity() + " " + team.getName() + " play " + team.getSport() + ". ");
			declareBeatTeam(team);
			System.out.print("\n");
		}
	}

}
