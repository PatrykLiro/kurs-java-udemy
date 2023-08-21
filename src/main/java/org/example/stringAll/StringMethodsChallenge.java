package org.example.stringAll;

public class StringMethodsChallenge {
    public static void main(String[] args) {
        String txt = "Ola ma kota. ".repeat(3);
        txt = txt.replaceAll("Ola", "Kasia");
        txt = txt.replaceFirst("Kasia", "Monika");
        System.out.println(txt);
        int firstIndexOf = txt.indexOf("Kasia");
        int lastIndexOf = txt.lastIndexOf("Kasia");
        System.out.println(firstIndexOf);
        System.out.println(lastIndexOf);
        System.out.println(txt.substring(firstIndexOf));
    }
}
