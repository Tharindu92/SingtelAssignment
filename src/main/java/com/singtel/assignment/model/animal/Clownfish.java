package com.singtel.assignment.model.animal;

/**
 * Question B.2.2 - Add a private attribute for colour and size and set it to orange and small and no setters for that so cannot change
 * Question B.2.4 - Add joke method into Clownfish class
 */
public class Clownfish extends Fish{
    private String size = "SMALL";
    private String colour = "ORANGE";

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
