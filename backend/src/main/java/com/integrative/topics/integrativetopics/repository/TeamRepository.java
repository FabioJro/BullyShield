package com.integrative.topics.integrativetopics.repository;

import com.integrative.topics.integrativetopics.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT DISTINCT t FROM Team t " +
            "JOIN t.disciplines d " +
            "WHERE d.professor.professorId =: professorId"
    )
    List<Team> findDistinctTeamsByDisciplinesProfessorId(@Param("professorId") Long professorId);
}
