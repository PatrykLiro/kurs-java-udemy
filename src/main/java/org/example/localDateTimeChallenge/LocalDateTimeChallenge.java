package org.example.localDateTimeChallenge;

import java.time.LocalDateTime;

public class LocalDateTimeChallenge {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTimeOf = LocalDateTime.of(2032, 12, 10, 22, 30, 3);
        if (localDateTimeOf.isAfter(localDateTime)) {
            System.out.println("Data z przyszłości");
            System.out.println(localDateTimeOf);
        }
    }
}
