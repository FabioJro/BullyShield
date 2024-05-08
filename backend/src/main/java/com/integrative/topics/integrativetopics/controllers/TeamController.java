package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.dtos.ViewListTeamsDTO;
import com.integrative.topics.integrativetopics.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService teamService;


    @GetMapping(path = "/find/teams-by{professorId}")
    @ResponseStatus(HttpStatus.OK)
    public Set<ViewListTeamsDTO> findTeamsByProfessorId(@PathVariable Long professorId){
        return teamService.findTeamsByProfessorId( professorId );
    }



}
