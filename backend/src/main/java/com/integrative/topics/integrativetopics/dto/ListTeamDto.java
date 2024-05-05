package com.integrative.topics.integrativetopics.dto;

import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Student;
import com.integrative.topics.integrativetopics.model.Team;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Setter
public class ListTeamDto {

    private Long id;
    private String teamName;
    private String teamSubject;
    private Double teamGlbAvg;
    private Integer teamFqcAvg;
    private Integer qtdStudents;
    private Integer qtdDisciplines;

    private List<ListDisciplinesDto> disciplines;

    public ListTeamDto(Team team){
        this.id = team.getTeamId();
        this.qtdDisciplines = getQtdDisciplines();
        this.teamName = team.getTeamName();
        this.teamSubject = team.getTeamSubject();
        this.teamGlbAvg = team.getTeamGlbAvg();
        this.teamFqcAvg = team.getTeamFqcAvg();
        this.qtdStudents = team.getStudents().size();
    }
    public Integer getQtdDisciplines(){
        return disciplines.size();
    }


}
