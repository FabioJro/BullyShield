package com.integrative.topics.integrativetopics.model;

import lombok.*;
import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "teamName")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long teamId;
    @Column(name = "t_name")
    private String teamName;
    @Column(name = "t_subject")
    private String teamSubject;
    @Column(name = "t_glb_avg")
    private double teamGlbAvg;
    @Column(name = "t_fqc_avg")
    private int teamFqcAvg;
    @OneToMany(mappedBy = "studentTeam")
    private Set<Student> students;
}
