package com.demo.UnitTestingAndMocking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GPACalculatorTest {

    @Mock
    StudentInfo student;

    @Mock
    GPACalculatorService calcService;

    @InjectMocks
    GPACalculator gpaCalci;

    /*
    @Before
    public void setUp() {
        List<StudentInfo.Pair> testGrades = new ArrayList<>();
        testGrades.add(new StudentInfo.Pair("A+", 3.00));
        testGrades.add(new StudentInfo.Pair("B+", 3.00));
        testGrades.add(new StudentInfo.Pair("A", 3.00));

        s = new StudentInfo(123,"GG", "A", testGrades );
        service = new GPACalculatorService();
        gpaCalci = new GPACalculator();
        gpaCalci.gpaService = service;
    }

    @Test
    public void testGPACalculator() {
        assertEquals(3.78, gpaCalci.getGPA(s), 0.01);
    }
    */

    @Test
    public void testStudentGPA() {
        // The when and thenReturn methods come from the org.mockito package.
        when(calcService.getGradePointValue("A")).thenReturn(4.00);
        when(calcService.getGradePointValue("B+")).thenReturn(3.33);
        when(calcService.getGradePointValue("A+")).thenReturn(4.00);
        when(student.getStudentGrades()).thenReturn(Arrays.asList(
                new StudentInfo.Pair("A+", 3.00),
                new StudentInfo.Pair("B+", 3.00),
                new StudentInfo.Pair("A", 3.00)));
        assertEquals(3.78, gpaCalci.getGPA(student), 0.01);

        verify(calcService).getGradePointValue("A");
        verify(calcService).getGradePointValue("B+");
        verify(calcService).getGradePointValue("A+");
        verify(calcService, times(3)).getGradePointValue(anyString());
        verify(student, times(1)).getStudentGrades();

    }
}
