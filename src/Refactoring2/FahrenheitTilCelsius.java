package Refactoring2;

import java.util.Scanner;

public class FahrenheitTilCelsius {

    public static void main(String[] args) {
        FahrenheitTilCelsius();
    }

    public static void FahrenheitTilCelsius() {

        Scanner input = new Scanner(System.in);

        System.out.print("Indtast en grad i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Konverter Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " grader Fahrenheit er " + celsius + " grader i Celsius");

    }
}


