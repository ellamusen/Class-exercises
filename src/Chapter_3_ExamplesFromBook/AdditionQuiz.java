package Chapter_3_ExamplesFromBook;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {

        // Generate numbers based on the current time in milliseconds using Java.lang.System.currentTimeMillis() method
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() * 7 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Display question to user
        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");

        // Prompt user to enter answer
        int answer = input.nextInt();

        // Display result
        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is " +
                        (number1 + number2 == answer));
    }
}
