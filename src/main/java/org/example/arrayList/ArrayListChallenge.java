package org.example.arrayList;

import java.util.ArrayList;

public class ArrayListChallenge {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        System.out.println("Pierwsze imię: " + names.get(0));
        names.set(2, "Olek");
        names.add(1, "Karol");
        names.remove(0);
        for (String n: names) {
            System.out.println(n);
        }
    }
}
