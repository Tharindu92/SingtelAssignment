package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuckTest {

    @Test
    void sing() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Duck duckObj = new Duck();
        duckObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Quack, quack");
    }

    @Test
    void fly() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Duck duckObj = new Duck();
        duckObj.fly();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am flying");
    }

    @Test
    void swim() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Duck duckObj = new Duck();
        duckObj.swim();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am swimming");
    }
}
