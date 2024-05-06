package com.integrative.topics.integrativetopics.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "professorId")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long professorId;

    @Column(name = "p_name")
    private String nome;

    @Column(name = "p_email")
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Set<Discipline> disciplines = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "professor_team",
    joinColumns = @JoinColumn(name = "professor_id"),
    inverseJoinColumns = @JoinColumn(name = "team_id"))
    private Set<Team> teams = new HashSet<>();


}
