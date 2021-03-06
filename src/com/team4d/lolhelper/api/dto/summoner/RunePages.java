package com.team4d.lolhelper.api.dto.summoner;

import java.util.ArrayList;

public class RunePages {
	private ArrayList<RunePage> pages;	//	Set of rune pages associated with the summoner.
	private long summonerId;				//	Summoner ID.
	/**
	 * @return the pages
	 */
	public ArrayList<RunePage> getPages() {
		return pages;
	}
	/**
	 * @return the summonerId
	 */
	public long getSummonerId() {
		return summonerId;
	}
}
