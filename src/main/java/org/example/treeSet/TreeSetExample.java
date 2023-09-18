package org.example.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> number = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            int ranInt = (int)Math.floor(Math.random() * 101);
            number.add(ranInt);
        }
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
