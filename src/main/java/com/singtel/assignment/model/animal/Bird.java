package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Sing;
import com.singtel.assignment.model.behaviour.Walk;

/**
 * Not all birds can fly
 */
public class Bird extends Animal implements Walk, Sing {

    /**
     * Question A.1 Implementation of Sing for bird
     * Question A.1.2 For maintainability I have seperate animal from behaviour. Based on the animal I implement the
     * behaviour interface. For commonly used methods like walk, swim and fly I have implement default method so no need
     * to reimplement again and again
     */
    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
