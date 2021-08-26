package com.singtel.assignment;

import com.singtel.assignment.model.animal.*;
import com.singtel.assignment.model.behaviour.Sing;
import com.singtel.assignment.service.AnimalCountService;

public class Solution {
    public static void main(String[] args){
        Animal bird = new Bird();
        ((Bird) bird).sing();
        ((Bird) bird).walk();

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
        Animal parrot = new Parrot(new Rooster());
        ((Parrot) parrot).sing();

        parrot = new Parrot(new Dog());
        ((Parrot) parrot).sing();

        parrot = new Parrot(new Cat());
        ((Parrot) parrot).sing();

        parrot = new Parrot("Ring Ring");
        ((Parrot) parrot).sing();


        System.out.println("No of Animals that can fly: "+ AnimalCountService.noOfAnimalsCanFly(animals));
        System.out.println("No of Animals that can walk: "+ AnimalCountService.noOfAnimalsCanWalk(animals));
        System.out.println("No of Animals that can sing: "+ AnimalCountService.noOfAnimalsCanSing(animals));
        System.out.println("No of Animals that can swim: "+ AnimalCountService.noOfAnimalsCanSwim(animals));

        /*
         * Transform Caterpillar to Butterfly
         */
        System.out.println();
        System.out.println("Transform Caterpillar to Butterfly");
        ((Butterfly) butterFly).transform();
        animals[11] = ((Butterfly) butterFly).getState();
        System.out.println("No of Animals that can fly: "+ AnimalCountService.noOfAnimalsCanFly(animals));
        System.out.println("No of Animals that can walk: "+ AnimalCountService.noOfAnimalsCanWalk(animals));
        System.out.println("No of Animals that can sing: "+ AnimalCountService.noOfAnimalsCanSing(animals));
        System.out.println("No of Animals that can swim: "+ AnimalCountService.noOfAnimalsCanSwim(animals));
    }
}
