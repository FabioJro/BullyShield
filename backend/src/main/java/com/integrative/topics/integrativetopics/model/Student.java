package com.integrative.topics.integrativetopics.model;

import lombok.*;
import jakarta.persistence.*;


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

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team studentTeam;

}
