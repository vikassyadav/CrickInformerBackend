package com.example.service;

import com.example.entities.Match;
import java.util.List;
 
public interface MatchService {
    // get all matches
    List<Match> getAllMatches();
    // get  live matches
    List<Match> getLiveMatches();
    // get t20 world cup 2k24 point table
    List<List<String>> getPointTable();
}
