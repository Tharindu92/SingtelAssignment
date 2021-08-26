package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SharkTest {

    @Test
    void eat() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Shark sharkObj = new Shark();
        sharkObj.eat();
        assertThat(consoleCaptor.getStandardOutput()).contains("Eats other fish");
    }

    @Test
    void getColour() {
        Shark sharkObj = new Shark();
        Assertions.assertEquals(sharkObj.getColour(),"GREY");
    }

    @Test
    void getSize() {
        Shark sharkObj = new Shark();
        Assertions.assertEquals(sharkObj.getSize(),"LARGE");
    }
}
