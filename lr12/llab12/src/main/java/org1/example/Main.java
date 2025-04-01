package org1.example;

public class Main {
    public static void main(String[] args) {
        Tester.printWelcome();

        Tester tester = new Tester("Ашота", "Петросян", 5, "Advanced", 3500.0);
        tester.displayInfo();
        tester.displayInfo("Тестировщик");
        tester.displayInfo("Детальная информация", true);
    }
}
