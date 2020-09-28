import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args) {

        System.out.println("Example of if statement");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two random numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x > y) {
            System.out.println("x is greater than y");
        }
        else if (x < y) {
            System.out.println("y is greater than x");
        }
        else if (x == y) {
            System.out.println("It's a tie!");

        }
    }
}
