package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BirdTest {

    /**
     * Question A.1.1 Implementation of Unit test for Sing method in Bird Class
     */
    @Test
    void sing() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Bird birdObj = new Bird();
        birdObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am singing");
    }

    @Test
    void walk() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Bird birdObj = new Bird();
        birdObj.walk();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am walking");
    }

}