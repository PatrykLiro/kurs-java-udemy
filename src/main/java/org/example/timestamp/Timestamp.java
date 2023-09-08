package org.example.timestamp;

import java.util.Date;

public class Timestamp {
    public static void main(String[] args) {
        Date date = new Date();
        long timestamp = date.getTime();
        System.out.println(timestamp);

        long oneHour = 60 * 1000 * 60;
        timestamp += oneHour * 24 * 3;
        timestamp += oneHour * 10;
        timestamp += 1000 * 60 * 25;

        Date futureDate = new Date(timestamp);
        System.out.println(futureDate);
    }
}
