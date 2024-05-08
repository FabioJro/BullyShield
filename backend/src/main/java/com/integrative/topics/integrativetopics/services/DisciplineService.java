package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.dtos.ViewDisciplineDTO;
import com.integrative.topics.integrativetopics.dtos.ViewStudentDTO;
import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Student;
import com.integrative.topics.integrativetopics.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DisciplineService {

    @Autowired
    private DisciplineRepository disciplineRepository;

    @Autowired
    private ProfessorService professorService;

    protected Discipline findDisciplineById(Long disciplineId){
        return disciplineRepository
                .findById( disciplineId )
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Discipline not found"));
    }

    public ViewDisciplineDTO showInfoDisciplineBy(Long disciplineId){
        Discipline discipline = findDisciplineById( disciplineId );

        Set<ViewStudentDTO> enrolledStudentsDTO = discipline.getStudents().stream()
                .map( ViewStudentDTO::new )
                .collect(Collectors.toSet());

        ViewDisciplineDTO viewDisciplineDTO = new  ViewDisciplineDTO( discipline, enrolledStudentsDTO );

         return viewDisciplineDTO;
    }

    public Set<ViewStudentDTO> showListOfDisciplinesAssociatesBy(String professorEnrollment){
        return null;
    }
}
