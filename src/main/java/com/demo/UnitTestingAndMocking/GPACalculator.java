package com.demo.UnitTestingAndMocking;

import java.util.List;

/**
 * Class used to demonstrate Junit and Mockit framework.
 * @author shreyash
 * @version 1.0.0
 */
public class GPACalculator {

    GPACalculatorService gpaService;

    /**
     * This method is used and tested in Junit which calculates the student grades
     * @param s - StudentInfo - Student record which contains grades earned per course
     * @return (double) GPA credits of a student on scale 0.0-4.0
     */
    public double getGPA(StudentInfo s) {

        List<StudentInfo.Pair> grades = s.getStudentGrades();

        double totalCreditHours = 0;
        double totalQualityPoints = 0;
        double gradePointValue;

        for(StudentInfo.Pair courseGrade: grades) {

            String grade = courseGrade.key;
            gradePointValue = gpaService.getGradePointValue(grade);

            double creditHours = courseGrade.value;
            totalQualityPoints = totalQualityPoints + (creditHours * gradePointValue);
            totalCreditHours = totalCreditHours + creditHours;
        }

        return totalQualityPoints/totalCreditHours;
    }

}
