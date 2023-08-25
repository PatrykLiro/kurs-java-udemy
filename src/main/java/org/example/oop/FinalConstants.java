package org.example.oop;

class Truck {
    String producent;
    String model;
    int wheels;
    String color;
    final float TOP_SPEED = 100;
    final float ACCELERATION;

    Truck() {
        this.producent = "Freightliner";
        this.model = "9664";
        this.wheels = 6;
        this.ACCELERATION = 60;
    }
    Truck(String color) {
        this();
        this.color = color;
    }
    public void printInfo() {
        System.out.println("Producent: " + this.producent + ". Kolor: " + this.color);
    }
}

public class FinalConstants {
    public static void main(String[] args) {
        Truck truck = new Truck("red");
        truck.printInfo();
    }
}
