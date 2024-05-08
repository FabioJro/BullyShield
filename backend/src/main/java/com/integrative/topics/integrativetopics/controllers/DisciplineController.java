package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.dtos.ViewDisciplineDTO;
import com.integrative.topics.integrativetopics.services.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/discipline")
public class DisciplineController {

    @Autowired
    private DisciplineService disciplineService;


    @GetMapping(path = "/show/info/discipline/{disciplineId}")
    @ResponseStatus(HttpStatus.OK)
    public ViewDisciplineDTO showViewDisciplineInformation(@PathVariable Long disciplineId){

        ViewDisciplineDTO viewDisciplineDTO = disciplineService.showInfoDisciplineBy( disciplineId );
        return viewDisciplineDTO;
    }
}
