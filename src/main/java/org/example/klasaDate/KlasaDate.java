package org.example.klasaDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KlasaDate {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.YY");
        System.out.println(dateFormat.format(date));
    }
}
