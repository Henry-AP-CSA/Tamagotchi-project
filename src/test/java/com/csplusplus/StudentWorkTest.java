package com.csplusplus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * <!-- ASSIGNMENT: Replace these example tests with tests for your methods. -->
 *
 * This file is read-only for students in VS Code / Codespaces.
 */
public class StudentWorkTest {

    // EXAMPLE TESTS — replace with your real assignment tests

    @Test
    void testIsEven_returnsTrueForEvenNumber() {
        assertTrue(StudentWork.isEven(4));
    }

    @Test
    void testIsEven_returnsFalseForOddNumber() {
        assertFalse(StudentWork.isEven(3));
    }

    @Test
    void testIsEven_returnsTrueForZero() {
        assertEquals(true, StudentWork.isEven(0));
    }
}
