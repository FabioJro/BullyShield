package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.model.Student;
import com.integrative.topics.integrativetopics.repository.StudentRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentRepository students;

    public StudentController(StudentRepository students){
        this.students = students;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return students.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found."));
    }

    @GetMapping
    public List<Student> findAll(){
        return students.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student save(@RequestBody Student student){
        return students.save(student);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        students.findById(id)
                .map(student -> {students.delete(student);
                return student;
                }).orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found."));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Student student){
        students.findById(id)
                .map(studentExist -> {
                    student.setStudentId(studentExist.getStudentId());
                    students.save(student);
                    return studentExist;
                }).orElseThrow(()->
                        new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
