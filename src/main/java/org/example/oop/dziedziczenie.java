package org.example.oop;

class Product {
    float price;
    String name;
    String manufacturer;
    int productionYear;
    Product() {
        name = "unknown";
        manufacturer = "unknown";
    }
}
class Mouse extends Product {
    public int numButtons;
    Mouse() {
        numButtons = 3;
    }
}
class VerticalMouse extends Mouse {
    VerticalMouse() {

    }
}
class Monitor extends Product {
    public int resolution;
    Monitor() {
        resolution = 1080;
    }
}
class Keybord extends Product {
    public int numKeys;
    Keybord() {
        numKeys = 103;
    }
}
class Computer extends Product {
    public Mouse mouse;
    public Monitor monitor;
    public Keybord keybord;
    Computer() {
        mouse = new Mouse();
        keybord = new Keybord();
        monitor = new Monitor();
    }
}

public class dziedziczenie {
    public static void main(String[] args) {
        Product product = new Product();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keybord keybord = new Keybord();
        Computer computer = new Computer();
    }
}
