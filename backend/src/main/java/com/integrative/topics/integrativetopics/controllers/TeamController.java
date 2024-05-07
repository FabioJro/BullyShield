package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.dtos.TeamDTO;
import com.integrative.topics.integrativetopics.model.Team;
import com.integrative.topics.integrativetopics.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService service;

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Optional<Team>> findById(@PathVariable Long id) {
//        Optional<Team> obj = service.findById(id);
//        return ResponseEntity.ok().body(obj);
//    }

    @GetMapping
    public ResponseEntity<List<TeamDTO>> findAll(){
        List<TeamDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
