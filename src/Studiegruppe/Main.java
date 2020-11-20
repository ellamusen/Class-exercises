package Studiegruppe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Students st1 = new Students();
        st1.navn = "A";
        st1.alder = 22;
        st1.by = "Næstved";

        Students st2 = new Students();
        st2.navn = "B";
        st2.alder = 23;
        st2.by = "Næstved";

        Students st3 = new Students();
        st3.navn = "C";
        st3.alder = 24;
        st3.by = "Næstved";

        Students st4 = new Students();
        st4.navn = "D";
        st4.alder = 25;
        st4.by = "Næstved";

        Students st5 = new Students();
        st5.navn = "E";
        st5.alder = 26;
        st5.by = "Næstved";


        // Kalder constructer 1
        Students st6 = new Students();
        st6.navn = "A";
        st6.alder = 22;
        st6.by = "Næstved";

        // Kalder constructor 2
        // FIX VARIABEL //Students st7 = new Students ("B", 22, "Næstved");

        // Kalder constructor 3
        // FIX VARIABEL //Students st8 = new Students("C", 22);


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Hvem vil du slå op?: ");
            String navnDerSkalSlaasOp = input.next();
            switch (navnDerSkalSlaasOp) {
                case "A":
                    System.out.println(st1.alder);
                    break;
                case "B":
                    System.out.println(st2.alder);
                    break;
                case "C":
                    System.out.println(st3.alder);
                    break;
                case "D":
                    System.out.println(st4.alder);
                    break;
                case "E":
                    System.out.println(st5.alder);
                default:
                    System.out.println("Kan ikke finde denne studerende");
            }
        }
    }
}
