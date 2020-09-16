import java.util.Scanner;

public class Exercise_SalesTax {

    public static void main(String[] args) {
        // 3. Made plusMoms its own method
        salesTax();
        plusMoms();
        plusTyskMoms();

    }

    // 1. Original code
    public static void salesTax() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);

        System.out.println();

    }

    // 2. Translated class, variables and tax amount to danish
    public static void plusMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("Indsæt et beløb: ");
        double beloeb = input.nextDouble();

        double moms = beloeb * 0.25;
        System.out.println("Momsen er " + (int) (moms * 100) / 100.0 + " DKK");

        System.out.println();

    }

    // 4. Translated class, variables and tax amount to german
    public static void plusTyskMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("Zahlen Sie einen Betrag ein (Lebensmittel): ");
        double mengeLebensmittel = input.nextDouble();

        // Tax on food is 5 percent
        double mwstLebensmittel = mengeLebensmittel * 0.05;
        System.out.println("Die Mehrwertsteuer beträgt " + (int) (mwstLebensmittel * 100) / 100.0 + " EUR");

        System.out.println();

        // Tax on other goods are 16 percent
        System.out.print("Zahlen Sie einen Betrag ein (Andere Güter): ");
        double mengeWaren = input.nextDouble();

        double mwstWaren = mengeWaren * 0.16;
        System.out.println("Die Mehrwertsteuer beträgt " + (int) (mwstWaren * 100) / 100.0 + " EUR");

    }

}
