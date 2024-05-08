package com.integrative.topics.integrativetopics.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "disciplineId")
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long disciplineId;

    @Column(name = "disc_name")
    private String disciplineName;

    @Column(name = "disc_grade_avg")
    private Double gradeAverage;

    @Column(name = "dis_freq_avg")
    private Double frequencyAverage;


    @ManyToMany(mappedBy = "disciplines")
    private Set<Team> teams = new HashSet<>();

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToMany(mappedBy = "disciplines")
    private Set<Student> students = new HashSet<>();

    @OneToMany(mappedBy = "discipline", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<DisciplineStudentInfo> disciplineStudentInfo;
}