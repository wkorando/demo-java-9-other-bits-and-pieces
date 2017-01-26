package com.khs.sports.service;

import java.util.List;

import com.khs.sports.model.SportsTeam;

public class ListBasedSportsService implements SportsService {

	private List<SportsTeam> teams;

	public ListBasedSportsService(List<SportsTeam> teams) {
		this.teams = teams;
	}

	@Override
	public void displayTeams() {
		for (SportsTeam team : teams) {
			System.out.print("The " + team.getHostCity() + " " + team.getName() + " play " + team.getSport() + ". ");
			declareBeatTeam(team);
			System.out.print("\n");
		}
	}

}
