package com.app.services;

import java.util.List;
import java.util.Map;

import com.app.entities.Match;

public interface MatchService {

	//list of all matches
	List<Match> getAllMatches();
	
	//list of live matches
	List<Match> getLiveMatches();
	
	//list of point table
	List<List<String>> getPointTable();
}
