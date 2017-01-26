package com.khs.sports.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import com.khs.sports.model.SportsTeam;

public class SlowSportsService implements SportsService {

	private List<SportsTeam> teams;

	public SlowSportsService(List<SportsTeam> teams) {
		this.teams = teams;
	}

	@Override
	public void displayTeams() {
		try {
			CompletableFuture.supplyAsync(getSlowTeams())
			.orTimeout(1, TimeUnit.SECONDS)
			// .completeOnTimeout(List.of(new SportsTeam("Chiefs", "Kansas City", "Football")), 1, TimeUnit.SECONDS)
			.thenAccept(this::displayTeams);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void displayTeams(List<SportsTeam> teams) {
		for (SportsTeam team : teams) {
			System.out.print("The " + team.getHostCity() + " " + team.getName() + " play " + team.getSport() + ". ");
			declareBeatTeam(team);
			System.out.print("\n");
		}
	}

	private Supplier<List<SportsTeam>> getSlowTeams() {
		return new Supplier<List<SportsTeam>>() {
			@Override
			public List<SportsTeam> get() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return teams;
			}
		};
	}

}
