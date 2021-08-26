package com.singtel.assignment.model.animal;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClownfishTest{
    @Test
    void jokes() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Clownfish clownfishObj = new Clownfish();
        clownfishObj.jokes();
        assertThat(consoleCaptor.getStandardOutput()).contains("Makes jokes");
    }

    @Test
    void getColour() {
        Clownfish clownfishObj = new Clownfish();
        Assertions.assertEquals(clownfishObj.getColour(),"ORANGE");
    }

    @Test
    void getSize() {
        Clownfish clownfishObj = new Clownfish();
        Assertions.assertEquals(clownfishObj.getSize(),"SMALL");
    }
}
