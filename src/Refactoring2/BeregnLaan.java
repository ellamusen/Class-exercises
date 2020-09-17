package Refactoring2;

import java.util.Scanner;

public class BeregnLaan {

    public static void main(String[] args) {
        BeregnLaan();
    }

    public static void BeregnLaan() {

        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Indtast årlig rente
        System.out.print("Indtast den årlige rente, for eksempel 8.25: ");
        double aarligeRente = input.nextDouble();

        // Få månedlig rente
        double maanedligeRente = aarligeRente / 1200;

        // Indtast antal år
        System.out.print(
                "Indtast et antal år som en integer, for eksempel 5: ");
        int antalAar = input.nextInt();

        // Indtast beløbet på lånet
        System.out.print("Indtast et beløb for lånet, for eksempel 120000.95: ");
        double laaneBeloeb = input.nextDouble();

        // Udregn betaling
        double maanedligBetaling = laaneBeloeb * maanedligeRente / (1
                - 1 / Math.pow(1 + maanedligeRente, antalAar * 12));
        double totalBeloeb = maanedligBetaling * antalAar * 12;

        // Vis resultat
        System.out.println("Den månedlige betaling er " +
                (int)(maanedligBetaling * 100) / 100.0 + " DKK");
        System.out.println("Det totale beløb er " +
                (int)(totalBeloeb * 100) / 100.0 + " DKK");

    }

}
