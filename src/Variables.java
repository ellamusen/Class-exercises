import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        byte bytevalue = 120;
        System.out.println("This is a byte value: " + bytevalue);

        short shortvalue = 10000;
        System.out.println("This is a short value: " + shortvalue);

        int intvalue = 5;
        System.out.println("This is an int value: " + intvalue);

        long longvalue = 250000L;
        System.out.println("This is a long value: " + longvalue);

        float floatvalue = 12576.0F;
        System.out.println("This is a float value: " + floatvalue);

        double doublevalue = 2432.0D;
        System.out.println("This is a double value: " + doublevalue);

        boolean booleanvalue = true;
        System.out.println("This is a boolean value: " + booleanvalue);

        char charvalue = 'a';
        System.out.println("This is a char value: " + charvalue);

        System.out.println();


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = input.nextDouble();

        System.out.print("Enter a boolean value: ");
        boolean booleanValue = input.nextBoolean();

        System.out.print("Enter a char value: ");
        char charValue = input.next().charAt(0);

    }

}
