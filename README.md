# Singtel Assignment

Code Assignement backend Chapter
### (A) Implementing Sing() for Bird
```java
/**
 * Question A.1 - Check Sing interface and Bird Class
 */
public interface Sing extends Behaviour{
    public void sing();
}
public class Bird extends Animal implements Walk, Sing {
    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
```
#### A.1.1. Unit test

```java
/**
 * Question A.1.1 Implementation of Unit test for Sing method in Bird Class
 */
@Test
void sing() {
    ConsoleCaptor consoleCaptor = new ConsoleCaptor();
    Bird birdObj = new Bird();
    birdObj.sing();
    assertThat(consoleCaptor.getStandardOutput()).contains("I am singing");
}
```
#### A.1.2. Optimizing code for Maintainability

    For maintainability I have seperate animal from behaviour. Based on the animal I implement the behaviour interface. For commonly used methods like walk, swim and fly I have implement default method so no need to reimplement again and again
### Implementing sound() for Duck and Chicken

#### A.2.1. duck says: “Quack , quack ”

```java
public class Duck extends Bird implements Swim, Fly {
    /**
     * Question A.2.1 - override Sing interface to make to change the way of the Duck singing
     */
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
```
#### A.2.2. duck can swim

```java
/**
 * Question A.2.2 - implement Swim interface to make Duck enable to swim
 */
public class Duck extends Bird implements Swim, Fly {
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
```
#### A.2.3. chicken says: “ Cluck, cluck ”

```java
public class Chicken extends Bird{
    /**
     * Question A.2.3 - override Sing interface to make to change the way of the Chicken singing
     */
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
```
#### A.2.4. chicken cannot fly

```java
/**
 * Question A.2.4 - Didn't implement Fly method to make the Chicken cannot fly
 */
public class Chicken extends Bird{
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
```
### Modeling Rooster

#### A.3.1. rooster says: “ Cock-a-doodle-doo ”
```java
public class Rooster extends Chicken{
    /**
     * Question A.3.1 - override Sing interface to make to change the way of the Rooster singing
     */
    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
```
#### A.3.2. How is the rooster related to the chicken?

```java
/**
 * Question A.3.2 Rooster is male version of the Chicken. So we can extend Chicken class and override sing method
 */
```
#### A.3.3. Other ways to model a rooster without using inheritance?
```java
/**
 * Question A.3.3 If we want to model Rooster without using inheritance we set a property inside Chicken class. We can create another constructor to pass the property value. And based on the property value sing method is executed
 */
```
### Modeling Parrot
```java
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
```
####A.4.1. A parrot living with dogs says: “Woof, woof”
```java
/**
 * Question A.4.1 when instantiating pass the instance of Dog to the constructor so the Parrot will sound like a dog
 */
Parrot parrot = new Parrot(new Dog());
parrot.sing();
```
####A.4.2. A parrot living with cats says: “ Me ow”
```java
/**
 * Question A.4.2 when instantiating pass the instance of Cat to the constructor so the Parrot will sound like a cat
 */
Parrot parrot = new Parrot(new Cat());
parrot.sing();
```
####A.4.3. A parrot living near the rooster says: “ Cock-a-doodle-doo ” 
```java
/**
 * Question A.4.3 when instantiating pass the instance of Rooster to the constructor so the Parrot will sound like a Rooster
 */
Parrot parrot = new Parrot(new Rooster());
parrot.sing();
```
####A.4.4. How do you keep the parrot maintainable?

```java
/**
 * Question A.4.4 when instantiating pass any animal and if that animal can sing the parrot will sound like that animal. If we Pass a string of a sound based on the environment the parrot will sound like that inserted sound
 */
Parrot parrot = new Parrot(<Any instance of Animal who can sing>);
parrot.sing();
or
Parrot parrot = new Parrot("Input sound effect as string");
parrot.sing();
```
### (B) Model fish as well as other swimming animals

### Modeling Fish
####B.1.1. Fish don’t sing
 ```java
/**
 * Question B.1.1 Not implemented Sing interface
 */
public class Fish extends Animal implements Swim {

}
```
####B.1.2. Fish don’t walk
```java
/**
 * Question B.1.2 Not implemented Walk interface
 */
public class Fish extends Animal implements Swim {

}
```
####B.1.3.Fish can swim
```java
/**
 * Question B.1.3 Implemented Swim interface
 */
public class Fish extends Animal implements Swim {

}
```
### Specialize the fish as a Shark and as a Clownfish
####B.2.1. Sharks are large and grey
```java
/**
 * Question B.2.1 - Add a private attribute for colour and size and set it to grey and large and no setters for that so cannot change
 */
public class Shark extends Fish{
    private String size = "LARGE";
    private String colour = "GREY";
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
```
####B.2.2. Clownfish are small and colourful (orange)
```java
/**
 * Question B.2.2 - Add a private attribute for colour and size and set it to orange and small and no setters for that so cannot change
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
```
####B.2.3. Clownfish make jokes
```java
/**
 * Question B.2.3 - Add joke method into Clownfish class
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
```
####B.2.4. Sharks eat other fish
```java
/**
 * Question B.2.4 - Add eat method into Shark class
 */
public class Shark extends Fish{
    private String size = "LARGE";
    private String colour = "GREY";
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
```
### Modelling Dolphin

####B.3.1.  Dolphin that swims without inheriting from a fish class

```java
/**
 * Question B.3.1 Extended Aminal class and implements Swim interface
 */
public class Dolhpin extends Animal implements Swim {
}
```
####B.3.2. Avoid duplicating code or introducing unneeded overhead
```java
/**
 * Question B.3.2 In Swim interface swim is a default method which is already implemented. So no need to reimplement swim method again
 */
public class Dolhpin extends Animal implements Swim {
}
```
### (C) Model animals that change their behaviour over time
#### Modelling Butterfly
#### C.1.1. Butterfly can fly
```java
public class Insect extends Animal implements Walk {
}
/**
 * Question C.1.1 Created new Class as Insect which implemets walk created butterfly class extending Insect class
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
```
#### C.1.2. A butterfly does not make a sound
```java
/**
 * Question C.1.2 Butterfly class has not implement Sing interface
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
```
### 2. Optimize model to account for the metamorphosis from caterpillar to butterfly
#### C.2.1.caterpillar cannot fly
```java
/**
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
```
#### C.2.2. A caterpillar can walk (crawl)
```java
/**
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
```

### (D) Counting animals based on below code snippet

```java
Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin (),
new Frog (),
new Dog(),
new Butterfly (),
new Cat()
};
```

####D.1.1. How many of these animals can fly?
```java
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
    
```
####D.1.2. How many of these animals can walk?
```java
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
```
####D.1.3. How many of these animals can sing?
```java
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
```  
####D.1.4. How many of these animals can swim?
```java
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
```
