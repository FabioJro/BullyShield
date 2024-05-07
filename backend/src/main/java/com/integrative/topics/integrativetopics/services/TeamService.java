package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.dtos.ProfessorDTO;
import com.integrative.topics.integrativetopics.dtos.TeamDTO;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import com.integrative.topics.integrativetopics.repository.TeamRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private TeamRepository teamRepository;

//    public Optional<TeamDTO> findById(Long id){
//        return teamRepository.findById(id);
//    }

    public List<TeamDTO> findAll() {
        List<Team> list = teamRepository.findAll();
        List<TeamDTO> listDTO = list.stream().map(x -> new TeamDTO(x)).collect(
                Collectors.toList());
        return listDTO;
    }

}
