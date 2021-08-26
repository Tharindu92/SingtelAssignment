package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InsectTest {
    @Test
    void walk() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Insect insectObj = new Insect();
        insectObj.walk();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am walking");
    }
}
