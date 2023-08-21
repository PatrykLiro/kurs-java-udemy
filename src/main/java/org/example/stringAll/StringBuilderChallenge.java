package org.example.stringAll;

public class StringBuilderChallenge {
    public static void main(String[] args) {
        String names[] = {"Ola", "Kasia", "Asia"};

        StringBuilder strBuilder = new StringBuilder();

        for (String s : names) {
            strBuilder.append(s);
            strBuilder.append(" ");
        }
        System.out.println(strBuilder.toString());
    }
}
