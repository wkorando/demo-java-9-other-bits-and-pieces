package com.khs.sports.service;

import java.util.List;

import org.junit.Test;

import com.khs.sports.model.SportsTeam;

public class TestListBasedSportsService {

	@Test
	public void printListOfTeams() {
		SportsService service = new ListBasedSportsService(List.of(new SportsTeam("Chiefs", "Kansas City", "Football"), //
				new SportsTeam("Royals", "Kansas City", "Baseball"), //
				new SportsTeam("Patriots", "New England", "Football"), //
				new SportsTeam("Penguins", "Pittsburgh", "Hockey"), //
				new SportsTeam("Stormchasers", "Omaha", "Baseball"), //
				new SportsTeam("Dolphins", "Miami", "Football")));
		
		service.displayTeams();
	}
}
