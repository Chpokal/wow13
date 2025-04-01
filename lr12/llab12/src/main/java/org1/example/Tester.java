package org1.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
        this("незнаю", "незнаю", 0, "незнаю", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "незнаю", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(name + " " + surname);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + ": " + name + " " + surname);
    }

    public void displayInfo(String prefix, boolean detailed) {
        if (detailed) {
            System.out.println(prefix + ": " + name + " " + surname + ", " + experienceInYears + " знания англа: " + englishLevel);
        } else {
            displayInfo(prefix);
        }
    }
    public static void printWelcome() {
        System.out.println("Салам тестер");
    }
}
