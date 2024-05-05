package com.integrative.topics.integrativetopics.services;
import com.integrative.topics.integrativetopics.model.Student;
import com.integrative.topics.integrativetopics.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Optional<Student> findById(Long id){
        return repository.findById(id);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student save(Student st) {
       return repository.save(st);
    }

    public  void delete(Long id){
        repository.deleteById(id);
    }

}
