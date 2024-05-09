package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.dtos.views.ViewStudentRecordDTO;
import com.integrative.topics.integrativetopics.model.Student;
import com.integrative.topics.integrativetopics.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public ViewStudentRecordDTO showStudentAndYourDisciplines(Long studentId){
        Student student = findStudentById( studentId );

        return new ViewStudentRecordDTO(student);
    }

    protected Student findStudentById(Long studentId){
        return studentRepository.findById( studentId )
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "the student not found"));
    }
}
