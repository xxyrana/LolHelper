package com.team4d.lolhelper.api.dto.team;

import java.util.ArrayList;

public class TeamStatSummary {
	private String fullId;	
	private ArrayList<TeamStatDetail> teamStatDetails;
	/**
	 * @return the fullId
	 */
	public String getFullId() {
		return fullId;
	}
	/**
	 * @return the teamStatDetails
	 */
	public ArrayList<TeamStatDetail> getTeamStatDetails() {
		return teamStatDetails;
	}
}
