package Method_Exercise;

public class Function {

    static String compare(int v1, int v2, int v3) {

        String out1 = "First variable is the highest";
        String out2 = "Second variable is the highest";
        String out3 = "Third variable is the highest";

        if (v1 > v2 && v1 > v3) {
            return out1;
        }
        else if (v2 > v1 && v2 > v3) {
            return out2;
        }
        else return out3;
    }
}
