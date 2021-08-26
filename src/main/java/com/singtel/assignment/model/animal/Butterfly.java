package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Fly;

/**
 * Question C.1.1 Created new Class as Insect which implemets walk created butterfly class extending Insect class
 * Question C.1.2 Butterfly class has not implement Sing interface
 * Question C.2.1/2 To implement transform from caterpillar to butterefly created 2 inner classes Butterfly State and Caterpillar state. Butterfly state has implement Fly interface while caterpillar is not
 */
public class Butterfly extends Insect {
    private Animal state = new CaterpillarState();

    public void transform() {
        state = new ButterflyState();
    }
    private class ButterflyState extends Insect implements Fly{

    }

    private class CaterpillarState extends Insect {

    }

    public Animal getState() {
        return state;
    }
}
