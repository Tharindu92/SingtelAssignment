package com.singtel.assignment.model.animal;

/**
 * Question A.3.2 Rooster is male version of the Chicken. So we can extend Chicken class and override sing method
 * Question A.3.3 If we want to model Rooster without using inheritance we set a property inside Chicken class. We can create another constructor to pass the property value. And based on the property value sing method is executed
 */
public class Rooster extends Chicken{
    /**
     * Question A.3.1 - override Sing interface to make to change the way of the Rooster singing
     */
    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
