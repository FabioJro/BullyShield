package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.repository.ProfessorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    private ProfessorRepository repository;

    @GetMapping
    public List<Professor> findAll(){
        return repository.findAll();
    }


}
