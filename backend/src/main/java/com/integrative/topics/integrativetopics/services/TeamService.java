package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.dto.ListDisciplinesDto;
import com.integrative.topics.integrativetopics.dto.ListTeamDto;
import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import com.integrative.topics.integrativetopics.repository.ProfessorRepository;
import com.integrative.topics.integrativetopics.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private DisciplineService disciplineService;

    @Autowired
    private ProfessorRepository professorRepository;

    public Optional<Team> findById(Long id){
        return teamRepository.findById(id);
    }

    public List<ListTeamDto> listTeamsDto(String email){
        Professor prof = professorRepository.findByProfessorEmail(email);
        List<ListTeamDto> listTeamDto  = listTeamDto(prof);
        //List<ListDisciplinesDto> listDisciplinesDto = listDisciplinesByProfessor(prof);
        return listTeamDto;
    }

    public List<ListDisciplinesDto> listDisciplinesByProfessor(Professor prof){
        List<Discipline> listDisc = disciplineService.findByProfessor(prof);
        List<ListDisciplinesDto> listDisciplinesDtos = new ArrayList<>();

        for(Discipline discipline : listDisc){
            listDisciplinesDtos.add(new ListDisciplinesDto(discipline, prof));
        }
        return listDisciplinesDtos;
    }

    public List<ListTeamDto> listTeamDto(Professor prof){
        List<Discipline> disciplineList = disciplineService.findByProfessor(prof);
        List<ListTeamDto> teamList = new ArrayList<>();

        for (Discipline disc: disciplineList){
            teamList.add(new ListTeamDto(disc.getDisciplinesTeam()));
        }
        return teamList;
    }
}
