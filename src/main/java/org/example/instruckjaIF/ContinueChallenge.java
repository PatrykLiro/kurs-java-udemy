package org.example.instruckjaIF;

public class ContinueChallenge {
    public static void main(String[] args) {
        for (int i = 0; i < 51; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
