package org.example.instruckjaIF;

public class IfDriverTest {
    public static void main(String[] args) {
        int points = 0;
        boolean driverLicense = true;
        int experienceYears = 15;
        boolean drunkDriving = true;
        boolean causedAccident = true;
        boolean overSpeeding = true;

        if (driverLicense) {
            points += 20;
        }
        if (experienceYears >= 10 && experienceYears <= 60) {
            points += 20;
        }
        if (experienceYears > 60) {
            points -= 20;
        }
        if (overSpeeding) {
            points -= 10;
        }
        if (drunkDriving || causedAccident) {
            points -= 100;
        }
        System.out.println(points);
    }
}
