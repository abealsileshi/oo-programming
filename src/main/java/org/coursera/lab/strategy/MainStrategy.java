package org.coursera.lab.strategy;
import java.util.ArrayList;

/*
    Abeal Sileshi 2/22/25
*/

// handling can be 'safety','sport',or 'racing'
interface HandlingStrategy{
    public void handle();
}

class SafetyHandling implements HandlingStrategy{
    public void handle(){
        System.out.println("eases through turn");
    }
}

class SportHandling implements HandlingStrategy{
    public void handle(){
        System.out.println("makes a tight turn");
    }
}

class RacingHandling implements HandlingStrategy{
    public void handle(){
        System.out.println("skids through the turn");
    }
}

class Sedan extends Car{
    //set handling at time of creation using strategy
    Sedan(HandlingStrategy handle){
        super("Sedan", handle);
    }
}

class Coupe extends Car{
    //set handling at time of creation using strategy
    Coupe(HandlingStrategy handle){
        super("Coupe", handle);
    }
}

class Convertible extends Car{
    //set handling at time of creation using strategy
    Convertible(HandlingStrategy handle){
        super("Convertible", handle);
    }
}

public class MainStrategy {
    public static void main(String[] args) {
        // Create a list of the different car objects
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Sedan(new SafetyHandling()));
        cars.add(new Coupe(new SafetyHandling()));
        cars.add(new Convertible(new SafetyHandling()));

        cars.add(new Sedan(new SportHandling()));
        cars.add(new Coupe(new SportHandling()));
        cars.add(new Convertible(new SportHandling()));

        cars.add(new Sedan(new RacingHandling()));
        cars.add(new Coupe(new RacingHandling()));
        cars.add(new Convertible(new RacingHandling()));

        // call the handle method for all of them
        for (Car c : cars) {
            System.out.print(c.name + " ");
            c.handle();
        }
    }
}

class Car {
    String type;
    String name;
    // where strategy is being composited in class
    HandlingStrategy handlingStrategy;
    protected static int carCounter = 0;

    Car(String type, HandlingStrategy handlingStrategy) {
        carCounter++;
        this.type = type;
        name = type + " " + carCounter;
        this.handlingStrategy = handlingStrategy;
    }
    
    // set handling at a later time
    public void handle(HandlingStrategy handling){
        this.handlingStrategy = handling;
    }
    public void handle() {
        System.out.print(" ");
        handlingStrategy.handle();
    } 
}