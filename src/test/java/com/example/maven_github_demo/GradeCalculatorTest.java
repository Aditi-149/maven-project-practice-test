package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    void testTotal() {
        assertEquals(225,
            GradeCalculator.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0,
            GradeCalculator.calculateAverage(75, 68, 82));
    }

    @Test
    void testPass() {
        assertTrue(GradeCalculator.isPass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(GradeCalculator.isPass(35.0));
    }
    
 // Grade A test
    @Test
    void testGradeA() {
        assertEquals("A",
            GradeCalculator.calculateGrade(95));
    }

    // Grade B test
    @Test
    void testGradeB() {
        assertEquals("B",
            GradeCalculator.calculateGrade(85));
    }

    // Grade C test
    @Test
    void testGradeC() {
        assertEquals("C",
            GradeCalculator.calculateGrade(75));
    }

    // Below 70 test
    @Test
    void testNoGrade() {
        assertEquals("No Grade",
            GradeCalculator.calculateGrade(65));
    }
}
