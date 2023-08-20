package org.example.instruckjaIF;

public class ForLoop {
    public static void main(String[] args) {
        String names[] = {"Ania", "Kasia", "Ola", "Olek", "Daniel"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println("Imię to: " + name);
        }
        for (int j = names.length - 1; j >= 0; j--) {
            String name = names[j];
            System.out.println("Imię, które są w odwrotnej kolejności to: " + name);
        }
    }
}
