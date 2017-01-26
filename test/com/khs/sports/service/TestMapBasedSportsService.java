package com.khs.sports.service;

import java.util.Map;

import org.junit.Test;

import com.khs.sports.model.SportsTeam;

public class TestMapBasedSportsService {
	@Test
	public void printMapOfTeams() {
		SportsService service = new MapBasedSportsService(Map.of(1, new SportsTeam("Chiefs", "Kansas City", "Football"), //
				2, new SportsTeam("Royals", "Kansas City", "Baseball"), //
				3, new SportsTeam("Patriots", "New England", "Football"), //
				4, new SportsTeam("Penguins", "Pittsburgh", "Hockey"), //
				5, new SportsTeam("Stormchasers", "Omaha", "Baseball"), //
				6, new SportsTeam("Dolphins", "Miami", "Football")));
		
		service.displayTeams();
	}
	
}
