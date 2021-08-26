package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Sing;
import com.singtel.assignment.model.behaviour.Walk;

public class Cat extends Animal implements Sing, Walk {

    @Override
    public void sing() {
        System.out.println("Me ow");
    }
}
