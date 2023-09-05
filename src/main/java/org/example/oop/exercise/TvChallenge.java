package org.example.oop.exercise;

class Tv {
    String manufacture;
    int year;
    float inch;

    public void tvInfo() {
        System.out.println(this.manufacture + " " + year + " " + inch);
    }
}

public class TvChallenge {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.manufacture = "Samsung";
        tv.year = 2022;
        tv.inch = 56.2f;
        tv.tvInfo();
    }
}
