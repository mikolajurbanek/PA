package animals.mammals;

import animals.movable;

public class Human extends Mammal {


    public Human(String name, double mass) {
        super(name, mass);
    }


    @Override
    public String getMovement() {
        return "walks on 2 legs";
    }

}
