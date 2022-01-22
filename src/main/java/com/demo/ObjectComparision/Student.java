package com.demo.ObjectComparision;

public class Student {

    private long studentId;
    private String studentFirstName;
    private String studentLastName;
    private double studentGPA;

    public Student(long studentId, String studentFirstName, String studentLastName) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
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

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
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

    public double getStudentGPA() {
        return studentGPA;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentId=" + studentId +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentGPA=" + studentGPA +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass()!=obj.getClass()) return false;
        Student that = (Student) obj;
        return this.studentId==that.studentId &&
                this.studentFirstName== that.studentFirstName &&
                this.studentLastName == that.studentLastName;
    }
}
