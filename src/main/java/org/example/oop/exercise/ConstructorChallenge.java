package org.example.oop.exercise;

class Student {
    String name;
    String surname;
    String city;
    int age;
    public Student() {
        this.name = "Jan";
        this.surname = "Kowalski";
        this.city = "Kraków";
        this.age = 30;
    }
    Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }
    public void printBasicData() {
        System.out.println(this.name + " " + this.surname + " " + this.city + " " + this.age);
    }
}
public class ConstructorChallenge {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printBasicData();

        Student student2 = new Student("Marek", "Nowak", "Warszawa", 18);
        student2.printBasicData();
    }
}
