package com.khs.sports.model;

public class SportsTeam {
	private String name;
	private String hostCity;
	private String sport;

	public SportsTeam(String name, String hostCity, String sport) {
		this.name = name;
		this.hostCity = hostCity;
		this.sport = sport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHostCity() {
		return hostCity;
	}

	public void setHostCity(String hostCity) {
		this.hostCity = hostCity;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
}