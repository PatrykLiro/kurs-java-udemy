package org.example.printf;

import java.util.Date;

public class PrintFChallenge {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("Data: %1$tY.%1$tm.%1$td", date);
    }
}
