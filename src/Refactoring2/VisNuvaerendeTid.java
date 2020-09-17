package Refactoring2;

public class VisNuvaerendeTid {

    public static void main(String[] args) {
        VisNuvaerendeTid();
    }

    public static void VisNuvaerendeTid() {

        // Få de totale millisekunder siden midnat den 1. jan, 1970
        long totalMillisekunder = System.currentTimeMillis();

        // Få de totale sekunder siden midnat, 1. jan, 1970
        long totalSekunder = totalMillisekunder / 1000;

        // Beregn det nuværende sekund i minuttet i timen
        long nuvaerendeSekunder = totalSekunder % 60;

        // Få de samlede antal minutter
        long totalMinutter = totalSekunder / 60;

        // Beregn det nuværende mniut i timen
        long nuvaerendeMinutter = totalMinutter % 60;

        // Få de samlede antal timer
        long totalTimer = totalMinutter / 60;

        // Beregn den nuværende time
        long nuvaerendeTime = totalTimer % 24;

        // Vis resultat
        System.out.println("Nuværende tid er " + nuvaerendeTime + ":"
                + nuvaerendeMinutter + ":" + nuvaerendeSekunder + " GMT");

    }

}
