package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Fly;
import com.singtel.assignment.model.behaviour.Swim;

/**
 * Question A.2.2 - implement Swim interface to make Duck enable to swim
 */
public class Duck extends Bird implements Swim, Fly {
    /**
     * Question A.2.1 - override Sing interface to make to change the way of the Duck singing
     */
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
