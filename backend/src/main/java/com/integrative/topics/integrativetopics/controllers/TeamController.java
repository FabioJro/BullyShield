package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.dto.ListTeamDto;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import com.integrative.topics.integrativetopics.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Team>> findById(@PathVariable Long id) {
        Optional<Team> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/teste")
    public ResponseEntity<List <ListTeamDto>> lisTeams(@RequestBody Professor prof){
        return ResponseEntity.ok(service.listTeamDto(prof));
    }



}
