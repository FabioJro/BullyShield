package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.dtos.ViewDisciplineDTO;
import com.integrative.topics.integrativetopics.dtos.ViewListOfDisciplinesDTO;
import com.integrative.topics.integrativetopics.dtos.ViewStudentDTO;
import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.repository.DisciplineRepository;
import com.integrative.topics.integrativetopics.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DisciplineService {

    @Autowired
    private DisciplineRepository disciplineRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private ProfessorService professorService;


    public ViewDisciplineDTO showInfoDisciplineBy(Long disciplineId){
        Discipline discipline = findDisciplineById( disciplineId );

        Set<ViewStudentDTO> enrolledStudentsDTO = discipline.getStudents().stream()
                .map( ViewStudentDTO::new )
                .collect(Collectors.toSet());

        ViewDisciplineDTO viewDisciplineDTO = new  ViewDisciplineDTO( discipline, enrolledStudentsDTO );

         return viewDisciplineDTO;
    }

    public Set<ViewDisciplineDTO> showListOfDisciplinesAssociatesBy(String professorEnrollment){
        Professor professor = professorService.findProfessorBy( professorEnrollment );
        Set<Discipline> disciplines = professorService.findDisciplinesByProfessorIdInTeams( professor );

        Set<ViewDisciplineDTO> disciplinesDTOS = convertCollectionDisciplinesDTO( disciplines );

        emptyCollectionHandling(Collections.singleton(disciplinesDTOS));

        return disciplinesDTOS;
    }

    public Set<ViewListOfDisciplinesDTO> showListOfDisciplineTeams(Long teamId){
        Set<Discipline> disciplines = teamRepository.findDisciplinesByTeamId( teamId );

        Set<ViewListOfDisciplinesDTO> disciplinesDTOS = convertCollectionDisciplineTeamsDTO( disciplines );

        emptyCollectionHandling(Collections.singleton(disciplinesDTOS));

        return disciplinesDTOS;
    }

    protected Discipline findDisciplineById(Long disciplineId){
        return disciplineRepository
                .findById( disciplineId )
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Discipline not found"));
    }

    protected Set<ViewDisciplineDTO> convertCollectionDisciplinesDTO(Set<Discipline> disciplines){
        Set<ViewDisciplineDTO> disciplinesDTOS = disciplines.stream()
                .map( ViewDisciplineDTO::new )
                .collect(Collectors.toSet());

        emptyCollectionHandling(Collections.singleton(disciplinesDTOS));

        return disciplinesDTOS;
    }

    protected Set<ViewListOfDisciplinesDTO> convertCollectionDisciplineTeamsDTO(Set<Discipline> disciplines){
        Set<ViewListOfDisciplinesDTO> disciplineDTOS = disciplines.stream()
                .map( ViewListOfDisciplinesDTO::new )
                .collect(Collectors.toSet());

        if ( disciplineDTOS.isEmpty() ){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }

        return disciplineDTOS;
    }

    protected void emptyCollectionHandling(Set<Object> collection){
        if (collection.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }
}
