package com.singtel.assignment.model.animal;

/**
 * Question B.2.2 - Add a private attribute for colour and size and set it to orange and small and no setters for that so cannot change
 * Question B.2.3 - Add joke method into Clownfish class
 */
public class Clownfish extends Fish{
    private static final String size = "SMALL";
    private static final String colour = "ORANGE";

    public void jokes(){
        System.out.println("Makes jokes");
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }
}
