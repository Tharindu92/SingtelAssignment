package com.singtel.assignment.model.animal;

/**
 * Question B.2.1 - Add a private attribute for colour and size and set it to grey and large and no setters for that so cannot change
 * Question B.2.4 - Add eat method into Shark class
 */
public class Shark extends Fish{
    private static final  String size = "LARGE";
    private static final  String colour = "GREY";

    public void eat(){
        System.out.println("Eats other fish");
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }
}
