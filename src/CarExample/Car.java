package CarExample;


public class Car {


    public boolean engineOn = false;
    private String password;
    public boolean handbrake;


    Car() {
        this.password = "password1234";
        this.engineOn = false;

    }

    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("Car is on");
            engineOn = true;
        } else {
            System.out.println("Car cannot turn on because of wrong key");
        }
    }

    public void handbrake(boolean b) {
        if (handbrake = true) {
            System.out.println("Handbrake is down");
        }
        else if (handbrake = false) {
            System.out.println("Handbrake is up, you cannot drive");
        }
    }

    public void changeToGear(GearShift gear) {
        switch (gear) {
            case FIRST -> System.out.println("Gearshift is in first gear");
            case SECOND -> System.out.println("Gearshift is in second gear");
            case THIRD -> System.out.println("Gearshift is in third gear");
            case FORTH -> System.out.println("Gearshift is in forth gear");
            case FIFTH -> System.out.println("Gearshift is in fifth gear");
            case SIXTH -> System.out.println("Gearshift is in sixth gear");
            case REVERSE -> System.out.println("Gearshift is in reverse");
            case NEUTRAL -> System.out.println("Gearshift is in neutral");
        }
    }

    public void pressClutch(boolean c) {
        if (c = true) {
            System.out.println("The clutch is pushed down");
        }
        else if (c = false) {
            System.out.println("The clutch is not pushed down");
        }
    }

    public void releaseClutch(int r) {
        if (r == 1) {
            System.out.println("The clutch has been released");
        }
        else if (r == 0) {
            System.out.println("The clutch has not been released");
        }
    }

    public void pressAccelerator(int a) {
        if (a == 0) {
            System.out.println("The accelerator is not pressed down, and the car isn't moving");
        }
        else if (a == 1) {
            System.out.println("The accelerator is pressed slightly down, and the car is moving");
        }
        else if (a == 2) {
            System.out.println("The accelerator is pressed all the way down, and the car is moving fast");
        }
    }

    public void aircon(int d) {
        if (d >= 20) {
            System.out.println("The air condition is on");
        }
        else {
            System.out.println("The air condition is not on");
        }
    }
}


