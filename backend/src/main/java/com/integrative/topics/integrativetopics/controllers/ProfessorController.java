package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.dtos.ProfessorDTO;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.repository.ProfessorRepository;
import com.integrative.topics.integrativetopics.services.ProfessorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    private ProfessorService professorService;

    @GetMapping
    public ResponseEntity<List<ProfessorDTO>> findAll(){
        List<ProfessorDTO> list = professorService.findAll();
        return ResponseEntity.ok().body(list);
    }


}
