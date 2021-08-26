package com.singtel.assignment.model.behaviour;

public interface Swim extends com.singtel.assignment.model.behaviour.Behaviour {
    public default void swim(){
        System.out.println("I am swimming");
    }
}
