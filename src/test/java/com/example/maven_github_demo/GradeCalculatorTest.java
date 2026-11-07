
package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    void testGradeA() {
        assertEquals("A",
            GradeCalculator.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B",
            GradeCalculator.calculateGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals("C",
            GradeCalculator.calculateGrade(75));
    }

    @Test
    void testNoGrade() {
        assertEquals("No Grade",
            GradeCalculator.calculateGrade(65));
    }

    @Test
    void testMinimumGradeA() {
        assertEquals("A",
            GradeCalculator.calculateGrade(90));
    }

    @Test
    void testMinimumGradeB() {
        assertEquals("B",
            GradeCalculator.calculateGrade(80));
    }

    @Test
    void testMinimumGradeC() {
        assertEquals("C",
            GradeCalculator.calculateGrade(70));
    }
}
