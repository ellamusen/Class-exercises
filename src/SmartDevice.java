public class SmartDevice {

    public static void main(String[] args) {

        // Klasse der printer en besked alt efter støv mængde
        // Værdi der fortæller støv mængde i huset

        SmartDevice.amountOfDust();

        }

    static void amountOfDust() {

        double dust = 49;
        if (dust >= 100) {
            System.out.println("It's time to clean!");
        }
    }
}

