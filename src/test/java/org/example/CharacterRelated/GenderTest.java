package org.example.CharacterRelated;

import org.example.CharacterRelated.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Gender Tests")

class GenderTest {

    public Gender TestContextMale;
    public Gender TestContextFemale;

    @BeforeEach
    void setUp() {
        TestContextMale = new Gender("M");
        TestContextFemale = new Gender("F");

    }

    @Test
    void displayGender() {
        assertEquals(TestContextFemale.DisplayGender(),"Female");
        assertEquals(TestContextMale.DisplayGender(),"Male");
    }
}