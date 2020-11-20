package Nedarvning;

import java.util.ArrayList;

public class Lager {

    ArrayList<Varer> varelager = new ArrayList<Varer>();

    public void fyldOp() {
        Varer b1 = new Bønner();
        varelager.add(b1);

        Varer æ1 = new Apple();
        varelager.add(æ1);


    }
}
