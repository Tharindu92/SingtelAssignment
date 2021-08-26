package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChickenTest {
    @Test
    void sing() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Chicken chickenObj = new Chicken();
        chickenObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Cluck, cluck");
    }
}
