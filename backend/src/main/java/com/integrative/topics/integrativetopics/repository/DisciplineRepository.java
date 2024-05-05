package com.integrative.topics.integrativetopics.repository;

import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Long> {

    //Professor findByProfessorEmail(String email);

    List<Discipline> findByProfessor(Professor prof);

    Team findByDisciplinesTeam(Discipline discipline);
}

