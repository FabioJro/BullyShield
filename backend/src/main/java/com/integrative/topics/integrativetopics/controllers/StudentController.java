package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.model.Student;
import com.integrative.topics.integrativetopics.services.StudentService;
import jdk.jfr.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable Long id){
        Optional<Student> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public List<Student> findAll(){
        List<Student> obj = service.findAll();
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student save(@RequestBody Student student){
        return service.save(student);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.findById(id)
                .map(student -> {
                    service.delete(student.getStudentId());
                return student;
                }).orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found."));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Student student){
        service.findById(id)
                .map(studentExist -> {
                    student.setStudentId(studentExist.getStudentId());
                    service.save(student);
                    return studentExist;
                }).orElseThrow(()->
                        new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
