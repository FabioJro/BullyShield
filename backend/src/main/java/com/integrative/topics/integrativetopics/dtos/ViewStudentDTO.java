package com.integrative.topics.integrativetopics.dtos;

import com.integrative.topics.integrativetopics.model.Student;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ViewStudentDTO {

    private Long studentId;

    private String studentName;

    private String studentEnrollment;

    private String studentGradeAvg;

    private String studentFrequencyAvg;



    public ViewStudentDTO(Student student){
        this.studentId = student.getStudentId();
        this.studentName = student.getStudentName();
        this.studentEnrollment = student.getStudentEnrollment();

        this.studentGradeAvg = String.valueOf( student.getStudentGradeAvg() );
        this.studentFrequencyAvg = String.valueOf( student.getSutdentFrequencyAvg() );
    }
}
