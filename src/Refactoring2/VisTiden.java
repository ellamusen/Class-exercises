package Refactoring2;

import java.util.Scanner;

    public class VisTiden {
        public static void main(String[] args) {
            visTiden();
        }

        public static void visTiden() {

            Scanner input = new Scanner(System.in);

            // Beder brugeren om at indtaste en integer for sekunder
            System.out.print("Indtast en integer for sekunder: ");
            int sekunder = input.nextInt();

            int minutter = sekunder / 60; // Finder minutter i sekunder
            int resterendeSekunder = sekunder % 60; // Resterende sekunder
            System.out.println(sekunder + " sekunder er " + minutter +
                    " minutter og " + resterendeSekunder + " sekunder");

        }
    }


