package com.integrative.topics.integrativetopics.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "studentEnrollment")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long studentId;
    @Column(name = "s_name")
    private String studentName;
    @Column(name = "s_avg")
    private Double studentAvg;
    @Column(name = "s_enrollment")
    private String studentEnrollment;
    @Column(name = "s_fqc")
    private Integer studentFqc;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team studentTeam;

    @ManyToMany
    @JoinTable(name = "student_discipline",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "discipline_id"))
    private Set<Discipline> disciplines = new HashSet<>();

}
