package org.example.oop.exercise;

class Car {
    String brand;
    String model;
    String color;

    Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void printInfo() {
        System.out.println(this.brand + " " + this.model + " " + this.color);
    }
}

class CarFactory {
    public Car buildCar() {
        String colors[] = {"black", "white", "red"};
        int random = (int) Math.floor(Math.random() * colors.length);
        String randomColor = colors[random];
        return new Car("Ford", "Mustang", randomColor);
    }
}

public class ReturnValueAndObject {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        car1.printInfo();
        System.out.println("Car1 color: " + car1.getColor());

        Car car2 = carFactory.buildCar();
        car2.printInfo();
        System.out.println("Car2 color: " + car2.getColor());
    }
}
