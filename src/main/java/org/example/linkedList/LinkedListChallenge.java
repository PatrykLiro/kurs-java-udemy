package org.example.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        String elements[] = {"Dog", "Cat", "Tiger", "Lion", "Panda"};
        for (int i = 0; i < 20; i++) {
            String ramndEl = elements[(int)Math.floor(Math.random() * elements.length)];
            animals.add(new Animal(ramndEl));
        }
        animals.removeFirst();
        animals.removeLast();
        animals.addFirst(new Animal("Tiger"));
        animals.addLast(new Animal("Lion"));

        ListIterator<Animal> iterator = animals.listIterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);
        }
    }
}
