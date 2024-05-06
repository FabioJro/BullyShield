package com.integrative.topics.integrativetopics.repository;

import com.integrative.topics.integrativetopics.dtos.TeamDTO;
import com.integrative.topics.integrativetopics.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
