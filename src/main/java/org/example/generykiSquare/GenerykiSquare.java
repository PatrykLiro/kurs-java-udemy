package org.example.generykiSquare;

class Square<T extends Number> {
    private T wall;

    public Square(T wall) {
        this.wall = wall;
    }

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    public double getSurfaceArea() {
        double wall = this.wall.doubleValue();
        return wall * wall;
    }
}

public class GenerykiSquare {
    public static void main(String[] args) {
        Square<Integer> integerSquare = new Square<>(10);
        System.out.println("int square area: " + integerSquare.getSurfaceArea());

        Square<Float> floatSquare = new Square<>(5.7f);
        System.out.println("float square area: " + floatSquare.getSurfaceArea());
    }
}
