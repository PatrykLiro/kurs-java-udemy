package org.example.instruckjaIF;

import java.util.Scanner;

public class InfinityLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        for ( ; ; ) {
            System.out.println("Wpisz liczbę lub quit jeśli chcesz zakończyć program");
            String data = scanner.nextLine();
            if (data.equalsIgnoreCase("quit")) break;

            int num = Integer.parseInt(data);
            number +=num;

            System.out.println("Wartość number: " + number);
        }
    }
}
