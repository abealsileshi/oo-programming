package org.coursera.lab.strategy;
import java.util.ArrayList;

/*
    Starting code with Car class for Strategy exercise
    You should refactor to use Strategy for handling
    Keep automatic car object naming as is
    Bruce Montgomery 10/12/24
*/

public class Main {
    public static void main(String[] args) {
        // Create a list of the different car objects
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("sedan"));
        cars.add(new Car("coupe"));
        cars.add(new Car("convertible"));
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
    int cost;
    String handling;
    protected static int carCounter = 0;

    Car(String type) {
        carCounter++;
        this.type = type;
        name = type + " " + carCounter;
        // moving to subclasses for Sedan, Coupe, Convertible should eliminate this
        // switch
        switch (this.type) {
            case "sedan":
                this.cost = 10000;
                this.handling = "safety";
                break;
            case "coupe":
                this.cost = 15000;
                this.handling = "sport";
                break;
            case "convertible":
                this.cost = 20000;
                this.handling = "racing";
                break;
            default:
                this.cost = 0;
                this.handling = "unknown";
        }
    }

    public void handle() {
        String action;
        // moving to handling algorithm subclasses should eliminate this switch
        switch (this.handling) {
            case "safety":
                action = "eases through turn";
                break;
            case "sport":
                action = "makes a tight turn";
                break;
            case "racing":
                action = "skids through a turn";
                break;
            default:
                action = "has undefined handling";
        }
        System.out.println(action);
    };
}
