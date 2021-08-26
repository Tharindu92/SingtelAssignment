package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoosterTest {

    @Test
    void sing() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Rooster roosterObj = new Rooster();
        roosterObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Cock-a-doodle-doo");
    }
}
