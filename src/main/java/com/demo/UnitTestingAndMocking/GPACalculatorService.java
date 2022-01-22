package com.demo.UnitTestingAndMocking;

/**
 * Service layor for GPACalculator class to fetch course grade point of course grade
 * @author shreyash
 * @version 1.0.0
 */
public class GPACalculatorService {

    /**
     * This method acts as service for our unit test class which returns grade point value of a course grade
     * @param grade - Student's course grade range(A-F)
     * @return
     */
    public double getGradePointValue(String grade) {

        double gradePointValue;

        switch (grade) {
            case "A+":
            case "A":  gradePointValue = 4.00;
                break;
            case "A-":  gradePointValue = 3.67;
                break;
            case "B+":  gradePointValue = 3.33;
                break;
            case "B":  gradePointValue = 3.00;
                break;
            case "B-":  gradePointValue = 2.67;
                break;
            case "C+":  gradePointValue = 2.33;
                break;
            case "C":  gradePointValue = 2.00;
                break;
            case "C-":  gradePointValue = 1.67;
                break;
            case "D+":  gradePointValue = 1.33;
                break;
            case "D":  gradePointValue = 1.00;
                break;
            case "D-":  gradePointValue = 0.67;
                break;
            case "F":
            default: gradePointValue = 0.00;
                break;
        }
        return gradePointValue;
        }

}

