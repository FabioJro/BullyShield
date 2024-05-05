package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import com.integrative.topics.integrativetopics.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DisciplineService {

    @Autowired
    private DisciplineRepository repository;

//    public Professor findByEmail(String str){
//        try {
//            return repository.findByProfessorEmail(str);
//        }catch (ResponseStatusException e){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
//        }
//
//    }

    public List<Discipline> findByProfessor(Professor prof) {
        List<Discipline> listDisciplines = repository.findByProfessor(prof);

        if(!listDisciplines.isEmpty()){
            return listDisciplines;
        }
         throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }

    public Team findByDisciplines(Discipline disc){
        return repository.findByDisciplinesTeam(disc);
    }
}
