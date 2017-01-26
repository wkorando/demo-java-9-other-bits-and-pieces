package com.khs.sports.service;

import com.khs.sports.model.SportsTeam;

public interface SportsService {
	default void declareBeatTeam(SportsTeam team){
		if(team.getHostCity().equalsIgnoreCase("Kansas City")){
			System.out.print(team.getName() + " is the best sports team!");
		}
	}
	
	public void displayTeams();
}
