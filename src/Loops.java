public class Loops {

    public static void main(String[] args) {

        System.out.println("Different types of loop");
        System.out.println("\t");

        // While loop
        System.out.println("*** This is a WHILE loop ***");
        int count1 = 0;                              // Loop-continuation-condition
        while (count1 < 5) {                         // Loop body
            System.out.println("Welcome to Java!");  // Loop body
            count1++; }                              // Loop body

        System.out.println("\t");

        // Do-While loop
        System.out.println("*** This is a DO-WHILE loop ***");
        int count2 = 0; do {                         // Loop body?
            System.out.println("Welcome to Java!");  // Loop body
            count2++;                                // Loop body
        } while (count2 < 5);                        // Loop-continuation-condition

        System.out.println("\t");

        // For loop
        System.out.println("*** This is a FOR loop ***");
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Welcome to Java!"); }


    }

}
