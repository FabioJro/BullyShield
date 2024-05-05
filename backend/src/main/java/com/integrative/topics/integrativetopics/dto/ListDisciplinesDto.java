package com.integrative.topics.integrativetopics.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import jakarta.persistence.*;

import java.util.Set;

public class ListDisciplinesDto {

    private Long disciplineDtoId;
    private String name;
    private Double disciplineAverage;
    private String professor;

    public ListDisciplinesDto(Discipline disc, Professor prof){
        this.disciplineDtoId = disc.getDisciplineId();
        this.professor = prof.getNome();
        this.name = disc.getName();
        this.disciplineAverage = disc.getDisciplineAverage();
    }

}
