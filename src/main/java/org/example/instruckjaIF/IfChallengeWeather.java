package org.example.instruckjaIF;

import java.util.Scanner;

public class IfChallengeWeather {
    public static void main(String[] args) {
        boolean raining = false;
        boolean haveUmbrella = true;
        int temperature = 15;

        if (temperature > 40 || temperature < -20) {
            System.out.println("Jest za gorąco bądź za zimno. Pozostań w domu");
        } else if ((temperature > -10 && temperature < 10) && raining && haveUmbrella) {
            System.out.println("Pada deszcz, ale masz parasolke. Możesz wyjść");
        } else if (temperature > 12 && !raining) {
            System.out.println("Możesz wyjść");
        } else {
            System.out.println("Pozostań w domu");
        }

    }
}
