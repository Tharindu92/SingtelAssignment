package com.singtel.assignment.model.animal;

/**
 * Question A.2.4 - Didn't implement Fly method to make the Chicken cannot fly
 */
public class Chicken extends Bird{
    /**
     * Question A.2.3 - override Sing interface to make to change the way of the Chicken singing
     */
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
