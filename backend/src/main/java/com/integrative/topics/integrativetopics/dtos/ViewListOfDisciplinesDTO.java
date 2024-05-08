package com.integrative.topics.integrativetopics.dtos;

import com.integrative.topics.integrativetopics.model.Discipline;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ViewListOfDisciplinesDTO extends ViewDisciplineDTO{

    private String teamName;

    public ViewListOfDisciplinesDTO(Discipline discipline) {
        super(discipline);
        this.teamName = discipline.getTeams().getClass().getName();
    }

    public ViewListOfDisciplinesDTO(Discipline discipline, Set<ViewStudentDTO> students) {
        super(discipline, students);
        this.teamName = discipline.getTeams().getClass().getName();
    }
}
