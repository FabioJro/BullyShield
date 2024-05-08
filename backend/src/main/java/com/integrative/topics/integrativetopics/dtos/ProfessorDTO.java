package com.integrative.topics.integrativetopics.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfessorDTO {

    private String name;
    private String email;
    private Set<ViewListTeamsDTO> teams;


}
