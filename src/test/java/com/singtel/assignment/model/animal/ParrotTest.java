package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Fly;
import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParrotTest extends Bird implements Fly {
    /**
     * Question A.4.1 when instantiating pass the instance of Dog to the constructor so the Parrot will sound like a dog
     */
    @Test
    void singWithDog() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Dog dogObj = new Dog();
        Parrot parrotObj = new Parrot(dogObj);
        parrotObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Woof, woof");
    }

    /**
     * Question A.4.2 when instantiating pass the instance of CatTest to the constructor so the Parrot will sound like a cat
     */
    @Test
    void singWithCat() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Cat catObj = new Cat();
        Parrot parrotObj = new Parrot(catObj);
        parrotObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Me ow");
    }

    /**
     * Question A.4.3 when instantiating pass the instance of Rooster to the constructor so the Parrot will sound like a Rooster
     */
    @Test
    void singWithRooster() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Rooster roosterObj = new Rooster();
        Parrot parrotObj = new Parrot(roosterObj);
        parrotObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Cock-a-doodle-doo");
    }
    /**
     * Question A.4.4 when instantiating pass any animal and if that animal can sing the parrot will sound like that animal. If we Pass a string of a sound based on the environment the parrot will sound like that inserted sound
     */
    @Test
    void singNearTelephone() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        Parrot parrotObj = new Parrot("Ring ring");
        parrotObj.sing();
        assertThat(consoleCaptor.getStandardOutput()).contains("Ring ring");
    }

}
