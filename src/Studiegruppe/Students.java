package Studiegruppe;

public class Students {

    String navn;
    int alder;
    String by;
    String studieretning;

    // Constructor
    Students() {
        studieretning = "Datamatiker";
    }

    // Constructor
    Students(String x, int y, String z) {
        this.navn = x;
        this.alder = y;
        this.by = z;
    }

    // Constructor
    public Students(String a, int b) {
        this.navn = a;
        this.alder = b;
    }
}


