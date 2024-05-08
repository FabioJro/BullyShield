package com.integrative.topics.integrativetopics.dtos;

import com.integrative.topics.integrativetopics.model.Discipline;

import java.util.Set;

public class ViewDisciplineDTO {

    private Long disciplineId;
    private String disciplineName;
    private String gradeAvg;
    private String frequencyAvg;
    private String aboveAvgStudents;
    private String belowAvgStudents;
    private String numberOfStudents;
    private String professorName;



    public ViewDisciplineDTO(Discipline discipline, Set<ViewStudentDTO> students){
        this.disciplineId = discipline.getDisciplineId();
        this.disciplineName = discipline.getDisciplineName();
        this.professorName = discipline.getProfessor().getNome();

        this.gradeAvg = String.valueOf( discipline.getGradeAverage() );
        this.frequencyAvg = String.valueOf( discipline.getFrequencyAverage() );

        this.aboveAvgStudents = calculateAboveAverageStudents(students);
        this.belowAvgStudents = calculateBelowAverageStudents(students);
        this.numberOfStudents = calculateNumberOfStudents(students);
    }

    protected String calculateAboveAverageStudents(Set<ViewStudentDTO> students){
        int aboveAvgStudents = 0;

        for (ViewStudentDTO student : students){
            double studentGradeAvg = Double.parseDouble( student.getStudentGradeAvg() );
            if ( studentGradeAvg >= 7 ){
                aboveAvgStudents++;
            }
        }

        return String.valueOf( aboveAvgStudents );
    }

    protected String calculateBelowAverageStudents(Set<ViewStudentDTO> students){
        int belowAvgStudents = 0;

        for (ViewStudentDTO student : students){
            double studentGradeAvg = Double.parseDouble( student.getStudentGradeAvg() );
            if ( studentGradeAvg < 7 ){
                belowAvgStudents++;
            }
        }

        return String.valueOf( belowAvgStudents );
    }

    protected String calculateNumberOfStudents(Set<ViewStudentDTO> students){
        return String.valueOf( students.size() );
    }
}
