package com.integrative.topics.integrativetopics.services;


import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;


    public Professor findProfessorBy(String enrollment){
        return professorRepository.findByEnrollment( enrollment );
    }
}
