package com.integrative.topics.integrativetopics.repository;

import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Long> {



    List<Discipline> findByProfessor(Professor professor);

}
