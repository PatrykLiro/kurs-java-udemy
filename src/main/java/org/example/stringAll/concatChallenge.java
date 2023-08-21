package org.example.stringAll;

public class concatChallenge {
    public static void main(String[] args) {
        String namesTable[] = {"Patryk", "Arek", "Damian", "Daniel"};
        String nameString = "";

        for (String name : namesTable) {
            nameString = nameString.concat(name);
            nameString += " ";
        }
        System.out.println(nameString);
    }
}
