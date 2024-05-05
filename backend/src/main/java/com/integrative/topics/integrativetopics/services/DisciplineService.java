package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.repository.DisciplineRepository;
import com.integrative.topics.integrativetopics.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DisciplineService {

    @Autowired
    private DisciplineRepository disciplineRepository;
    @Autowired
    private ProfessorRepository professorRepository;


    protected Professor findProfessor(Long professorId){
        return professorRepository
                .findById(professorId)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Professor not found")
                );
    }


    public List<Discipline> listDisciplineWith(Long professorId){
        Professor professor = findProfessor(professorId);

        List<Discipline> disciplines = disciplineRepository.findByProfessor( professor );

        if (disciplines.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "There are no subjects linked to the teacher");
        }
        return disciplines;
    }
}
