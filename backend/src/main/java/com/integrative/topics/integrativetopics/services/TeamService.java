package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.dtos.TeamDTO;
import com.integrative.topics.integrativetopics.model.Team;
import com.integrative.topics.integrativetopics.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository repository;

    public Optional<Team> findById(Long id){
        return repository.findById(id);
    }

}
