package org.example.wyjatki;

public class Wyjatki {
    public static void main(String[] args) {
        try {
            int value = 10/0;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        try {
            throw new TestException();
        }  catch (TestException exception) {
            exception.printStackTrace();
        }
    }
}
