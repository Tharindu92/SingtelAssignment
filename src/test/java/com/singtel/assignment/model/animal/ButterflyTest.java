package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Fly;
import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButterflyTest{

    @Test
    void caterpillarNotFly(){
        Animal butterflyCaterpillar = new Butterfly().getState();
        Assertions.assertFalse(Fly.class.isAssignableFrom(butterflyCaterpillar.getClass()));
    }

    @Test
    void butterflytFly(){
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Animal butterfly = new Butterfly();
        ((Butterfly) butterfly).transform();
        butterfly = ((Butterfly) butterfly).getState();
        ((Fly) butterfly).fly();
        assertThat(consoleCaptor.getStandardOutput()).contains("I am flying");
    }
}
