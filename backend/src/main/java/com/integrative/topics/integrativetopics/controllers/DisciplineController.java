package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.services.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/api/discipline")
public class DisciplineController {

    @Autowired
    private DisciplineService disciplineService;

    @GetMapping(path = "/list-disciplines-with-professor-{professorId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Discipline> listDisciplinesWithProfessor(@PathVariable Long professorId){
        return disciplineService.listDisciplineWith(professorId);
    }
}
