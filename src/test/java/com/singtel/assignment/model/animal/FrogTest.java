package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogTest {

    @Test
    void sing() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Frog frogObj = new Frog();
        frogObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Baka Baka");
    }

    @Test
    void walk() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Frog frogObj = new Frog();
        frogObj.walk();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am walking");
    }

    @Test
    void swim() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Frog frogObj = new Frog();
        frogObj.swim();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am swimming");
    }
}
