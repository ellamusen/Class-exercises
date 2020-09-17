package Refactoring2;

import java.util.Scanner;

public class BeregnAendring {

    public static void main(String[] args) {
        BeregnAendring();
    }

    public static void BeregnAendring() {

        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Modtag beløbet
        System.out.print(
                "Indtast et beløb i double, for eksempel 11,56: ");
        double beloeb = input.nextDouble();

        int resterendeBeloeb = (int)(beloeb * 100);

        // Find tallet på en enkelt dollar
        int talletPaaEnEnkeltDollar = resterendeBeloeb / 100;
        resterendeBeloeb = resterendeBeloeb % 100;

        // Find tallet på en quarter i det resterende beløb
        int talletPaaEnQuarter = resterendeBeloeb / 25;
        resterendeBeloeb = resterendeBeloeb % 25;

        // Find tallet på dimes i det resterende beløb
        int talletPaaEnDime = resterendeBeloeb / 10;
        resterendeBeloeb = resterendeBeloeb % 10;

        // Find tallet på nickles i det resterende beløb
        int talletPaaEnNckle = resterendeBeloeb / 5;
        resterendeBeloeb = resterendeBeloeb % 5;

        // Find tallet på pennies i det resterende beløb
        int talletPaaEnPenny = resterendeBeloeb;

        // Vis resultat
        System.out.println("Dit beløb " + beloeb + " består af");
        System.out.println("    " + talletPaaEnEnkeltDollar + " dollars");
        System.out.println("    " + talletPaaEnQuarter + " quarters ");
        System.out.println("    " + talletPaaEnDime + " dimes");
        System.out.println("    " + talletPaaEnNckle + " nickels");
        System.out.println("    " + talletPaaEnPenny + " pennies");

    }

}
