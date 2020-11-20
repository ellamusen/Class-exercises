public class Selections {

    public static void main(String[] args) {

        // Der findes to slags selektions
        // If og Switch

        // if

        // switch
        String color = "purple";
        int number = 0;

        switch (color) {
            case "red":
                System.out.println("En rød sportsvogn");
            case "green":
                System.out.println("En grøn offroader");
                break;
            default:
                System.out.println("En eller anden random bil");
        }

        // x.equals("red") = Man kan ikke skrive x == "red" i Java (det virker, men det giver utilsigtet resultater)
        // - hvis det er strings

    }
}


