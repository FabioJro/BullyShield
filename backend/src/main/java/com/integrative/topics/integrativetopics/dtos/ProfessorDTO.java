package com.integrative.topics.integrativetopics.dtos;

import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.model.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfessorDTO {

    private String name;
    private String email;
    private Set<TeamDTO> teams;


}
