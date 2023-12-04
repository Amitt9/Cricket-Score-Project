package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Match;
import com.app.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	//get live matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches()
	{
		return new ResponseEntity<>(matchService.getLiveMatches(), HttpStatus.OK);
	}
	
	//get all matches
	@GetMapping("/all")
	public ResponseEntity<List<Match>> getAllMatch()
	{
		return new ResponseEntity<>(matchService.getAllMatches(),HttpStatus.OK);
	}
	
	//get point table
	@GetMapping("/pointtable")
	public ResponseEntity<?> getPointTable()
	{
		return new ResponseEntity<>(matchService.getPointTable(),HttpStatus.OK);
	}
	
	
}
