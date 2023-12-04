package com.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {

	//TO fetch team by teamheading
	Optional<Match> findByTeamHeading(String teamHeading);
}
