package com.singtel.assignment.model.behaviour;

public interface Fly extends com.singtel.assignment.model.behaviour.Behaviour {
    public default void fly(){
        System.out.println("I am flying");
    }
}
