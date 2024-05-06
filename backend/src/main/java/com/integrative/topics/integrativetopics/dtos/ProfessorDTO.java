package com.integrative.topics.integrativetopics.dtos;

import com.integrative.topics.integrativetopics.model.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfessorDTO {

    private String name;
    private String email;
    private List<TeamDTO> teams;
}
