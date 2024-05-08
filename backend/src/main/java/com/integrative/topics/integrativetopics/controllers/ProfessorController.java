package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.dtos.ProfessorDTO;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import com.integrative.topics.integrativetopics.repository.ProfessorRepository;
import com.integrative.topics.integrativetopics.repository.TeamRepository;
import com.integrative.topics.integrativetopics.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    private ProfessorService professorService;

    @Autowired
    private TeamRepository teamRepository;


}
