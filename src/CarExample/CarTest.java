package CarExample;

public class CarTest {

    public static void main(String[] args) {
        testSuite();

        

    }

    private static void testSuite() {
        System.out.println("The testsuite is running");
        System.out.print("Test 1: Car has to be turned on: ");
        testStartCarWithCorrectKey();
        System.out.print("Test 2: Car has to be turned off: ");
        testStartCarWithWrongKey();
        System.out.println("Test 3: Can the car drive?: ");
        testIfCarCanDrive();

    }

    private static void testStartCarWithCorrectKey() {
        Car andrasBil = new Car();
        CarKey key = new CarKey("password1234");
        andrasBil.turnEngineOn(key);
    }

    private static void testStartCarWithWrongKey() {
        Car andrasBil = new Car();
        CarKey key = new CarKey("hest");
        andrasBil.turnEngineOn(key);
    }

    public static void testIfCarCanDrive() {
        Car andrasBil = new Car();
        CarKey key = new CarKey("password1234");
        andrasBil.turnEngineOn(key);
        andrasBil.handbrake(true); // Tjek at håndbremsen er fra
        andrasBil.changeToGear(GearShift.NEUTRAL); // Tjek om den er i frigear
        andrasBil.pressClutch(true); // Hvis den er, tryk kobling ned
        andrasBil.changeToGear(GearShift.FIRST); // Skift gear til 1
        andrasBil.releaseClutch(1); // Slip koblingen
        andrasBil.pressAccelerator(2); // Tryk på gaspedalen (halvt)
        andrasBil.aircon(23); // Der er 23 grader celsius i bilen
    }
}


