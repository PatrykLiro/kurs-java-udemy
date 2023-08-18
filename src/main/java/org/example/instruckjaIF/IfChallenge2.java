package org.example.instruckjaIF;

import java.util.Scanner;

public class IfChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("Jaka jest twoja waga?");
            int weight = scanner.nextInt();
            if(weight >= 50) {
                System.out.println("Możesz oddać krew");
            } else {
                System.out.println("Ważysz za mało, nie możesz oddać krwi");
            }
        } else {
            System.out.println("Jesteś za mało lat, nie możesz oddać krwi");
        }
    }
}
