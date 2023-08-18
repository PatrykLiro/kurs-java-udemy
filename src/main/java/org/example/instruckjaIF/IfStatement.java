package org.example.instruckjaIF;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz liczbę");
            int number = scanner.nextInt();

            if(number > 0) {
                System.out.println("Liczba jest dodatnia");
            } else if(number < 0) {
                System.out.println("Liczba jest ujemna");
            } else {
                System.out.println("Liczba jest zerem");
            }
        }
    }
}
