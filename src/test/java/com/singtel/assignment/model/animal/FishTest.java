package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FishTest {
    @Test
    void swim() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Fish fishObj = new Fish();
        fishObj.swim();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am swimming");
    }
}
