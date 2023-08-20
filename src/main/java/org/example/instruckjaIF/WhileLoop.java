package org.example.instruckjaIF;

public class WhileLoop {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        int number = 0;
        while (number < numbers.length) {
            System.out.println(numbers[number] * 2);
            number++;
        }
    }
}
