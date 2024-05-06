package com.integrative.topics.integrativetopics.dtos;

import com.integrative.topics.integrativetopics.model.Team;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
public class TeamDTO {

    private String teamName;
    private Double teamGlbAvg;
    private Integer teamFqcAvg;

    public static TeamDTO turnIntoDTO(Optional<Team> t){
        return new TeamDTO();
    }
}
