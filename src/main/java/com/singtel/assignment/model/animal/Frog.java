package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Sing;
import com.singtel.assignment.model.behaviour.Swim;
import com.singtel.assignment.model.behaviour.Walk;

public class Frog extends Animal implements Sing, Walk, Swim {
    @Override
    public void sing() {
        System.out.println("Baka Baka");
    }
}
