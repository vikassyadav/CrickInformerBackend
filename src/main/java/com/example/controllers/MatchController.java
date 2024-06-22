package com.example.controllers;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Match;
import com.example.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {
//firstcommit fork
    private MatchService matchService;
    // constructor injection
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    // get Live matches data
    @GetMapping("/livematches")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }
    // get all matches
    @GetMapping //("/allmatches")
    public ResponseEntity<List<Match>> getAllMaatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }
    
}
