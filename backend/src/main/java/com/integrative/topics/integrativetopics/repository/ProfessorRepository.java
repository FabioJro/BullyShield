package com.integrative.topics.integrativetopics.repository;

import com.integrative.topics.integrativetopics.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor, Long> {
}
