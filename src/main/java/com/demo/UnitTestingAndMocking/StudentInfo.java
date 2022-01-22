package com.demo.UnitTestingAndMocking;

import java.util.List;

/**
 * This class acts as DTO for GPACalculator class.
 * It holds student records including grades earned per course credit.
 * @version 1.0.0
 * @author shreyash
 */
public class StudentInfo {

    private long studentId;
    private String studentFirstName;
    private String studentLastName;
    private List<Pair> studentGrades;

    public StudentInfo(long studentId, String studentFirstName, String studentLastName, List<Pair> studentGrades) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentGrades = studentGrades;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public void setStudentGrades(List<Pair> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public List<Pair> getStudentGrades() {
        return studentGrades;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentId=" + studentId +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentGrades=" + studentGrades +
                '}';
    }

    /**
     * Inline class to hold key value pair.
     * Key is course grade (A,B,C,F) with +,- variations
     * Value is course credit hours
     */
    public static class Pair {
        public String key;
        public double value;

        public Pair(String key, double value) {
            this.key = key;
            this.value = value;
        }
    }
}
