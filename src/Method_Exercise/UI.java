package Method_Exercise;

import java.util.Scanner;

public class UI {

    static void runUI() {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter v1, v2 and v3: ");
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        int v3 = input.nextInt();

        String result = Function.compare(v1, v2, v3);
        System.out.println(result);


    }
}
