package com.singtel.assignment.service;

import com.singtel.assignment.model.animal.Animal;
import com.singtel.assignment.model.behaviour.Fly;
import com.singtel.assignment.model.behaviour.Sing;
import com.singtel.assignment.model.behaviour.Swim;
import com.singtel.assignment.model.behaviour.Walk;

public class AnimalCountService {

    /**
     * Question D.1.1 Number of animals that can fly
     * @param animals array of animals
     * @return number of animals that can fly
     */
    public static int noOfAnimalsCanFly(Animal[] animals){
        int countFly = 0;
        for(Animal animal: animals){
            if(Fly.class.isAssignableFrom(animal.getClass())){
                countFly++;
            }
        }
        return countFly;
    }

    /**
     * Question D.1.2 Number of animals that can walk
     * @param animals array of animals
     * @return number of animals that can walk
     */
    public static int noOfAnimalsCanWalk(Animal[] animals){
        int countWalk = 0;
        for(Animal animal: animals){
            if(Walk.class.isAssignableFrom(animal.getClass())){
                countWalk++;
            }
        }
        return countWalk;
    }

    /**
     * Question D.1.3 Number of animals that can sing
     * @param animals array of animals
     * @return number of animals that can sing
     */
    public static int noOfAnimalsCanSing(Animal[] animals){
        int countSing = 0;
        for(Animal animal: animals){
            if(Sing.class.isAssignableFrom(animal.getClass())){
                countSing++;
            }
        }
        return countSing;
    }

    /**
     * Question D.1.4 Number of animals that can swim
     * @param animals array of animals
     * @return number of animals that can swim
     */
    public static int noOfAnimalsCanSwim(Animal[] animals){
        int countSwim = 0;
        for(Animal animal: animals){
            if(Swim.class.isAssignableFrom(animal.getClass())){
                countSwim++;
            }
        }
        return countSwim;
    }
}
