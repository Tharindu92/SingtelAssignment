package com.singtel.assignment.model.behaviour;

public interface Walk extends Behaviour{
    public default void walk(){
        System.out.println("I am walking");
    }
}
