package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DolhpinTest {
    @Test
    void swim() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Dolhpin dolhpinObj = new Dolhpin();
        dolhpinObj.swim();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am swimming");
    }

}
