package com.singtel.assignment.service;

import com.singtel.assignment.model.animal.*;
import com.singtel.assignment.model.behaviour.Fly;
import com.singtel.assignment.model.behaviour.Sing;
import com.singtel.assignment.model.behaviour.Swim;
import com.singtel.assignment.model.behaviour.Walk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalCountServiceTest {

    @Test
    void noOfAnimalsCanFlyWithButterflyInCaterpillarState(){
        Animal butterFly = new Butterfly();
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolhpin (),
                new Frog (),
                new Dog(),
                ((Butterfly) butterFly).getState(), //Initial State is Caterpillar
                new Cat()
        };
        Assertions.assertEquals(2, AnimalCountService.noOfAnimalsCanFly(animals));
    }

    @Test
    void noOfAnimalsCanFlyWithButterflyInButterflyState(){
        Animal butterFly = new Butterfly();
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolhpin (),
                new Frog (),
                new Dog(),
                ((Butterfly) butterFly).getState(), //Initial State is Caterpillar
                new Cat()
        };
        /*
         * Transform Caterpillar
         */
        ((Butterfly) butterFly).transform();
        animals[11] = ((Butterfly) butterFly).getState();

        Assertions.assertEquals(3, AnimalCountService.noOfAnimalsCanFly(animals));
    }

    @Test
    void noOfAnimalsCanWalk(){
        Animal butterFly = new Butterfly();
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolhpin (),
                new Frog (),
                new Dog(),
                ((Butterfly) butterFly).getState(), //Initial State is Caterpillar
                new Cat()
        };
        Assertions.assertEquals(9, AnimalCountService.noOfAnimalsCanWalk(animals));
    }

    @Test
    void noOfAnimalsCanSing(){
        Animal butterFly = new Butterfly();
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolhpin (),
                new Frog (),
                new Dog(),
                ((Butterfly) butterFly).getState(), //Initial State is Caterpillar
                new Cat()
        };
        Assertions.assertEquals(8, AnimalCountService.noOfAnimalsCanSing(animals));
    }

    @Test
    void noOfAnimalsCanSwim(){
        Animal butterFly = new Butterfly();
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolhpin (),
                new Frog (),
                new Dog(),
                ((Butterfly) butterFly).getState(), //Initial State is Caterpillar
                new Cat()
        };
        Assertions.assertEquals(6, AnimalCountService.noOfAnimalsCanSwim(animals));
    }
}
