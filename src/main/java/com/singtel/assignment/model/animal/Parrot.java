package com.singtel.assignment.model.animal;

import com.singtel.assignment.model.behaviour.Fly;
import com.singtel.assignment.model.behaviour.Sing;

/**
 * Question A.4.1 when instantiating pass the instance of Dog to the constructor so the Parrot will sound like a dog
 * Question A.4.2 when instantiating pass the instance of Cat to the constructor so the Parrot will sound like a cat
 * Question A.4.3 when instantiating pass the instance of Rooster to the constructor so the Parrot will sound like a Rooster
 * Question A.4.4 when instantiating pass any animal and if that animal can sing the parrot will sound like that animal. If we Pass a string of a sound based on the environment the parrot will sound like that inserted sound
 */
public class Parrot extends Bird implements Fly {
    private Animal animalNearParrot = null;
    private String soundMake = null;
    public Parrot(Animal animalNearParrot){
        this.animalNearParrot = animalNearParrot;
    }
    public Parrot(String soundMake){
        this.soundMake = soundMake;
    }

    public Parrot(){
        super();
    }

    @Override
    public void sing() {
        if(animalNearParrot != null){
            if(Sing.class.isAssignableFrom(animalNearParrot.getClass())){
                ((Sing) animalNearParrot).sing();
            }else {
                super.sing();
            }
        }else if(soundMake != null){
            System.out.println(soundMake);
        }else {
            super.sing();
        }
    }
}
