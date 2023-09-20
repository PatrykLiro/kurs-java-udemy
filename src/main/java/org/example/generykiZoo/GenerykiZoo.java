package org.example.generykiZoo;

import java.util.ArrayList;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
}
class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }
}

class Zoo<T extends Animal> {
    private ArrayList<T> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }
    public void addAnimal(T animal) {
        this.animals.add(animal);
    }
    public void printAllAnimals() {
        for (Animal a: animals ) {
            System.out.println(a);
        }
    }
}

public class GenerykiZoo {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger("Tiger #1", 5));
        zoo.addAnimal(new Lion("Lion #1", 10));
        zoo.addAnimal(new Tiger("Tiger #2", 7));
        zoo.printAllAnimals();
    }
}
