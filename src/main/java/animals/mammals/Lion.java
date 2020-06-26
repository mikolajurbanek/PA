package animals.mammals;

import animals.movable;

public class Lion extends Mammal {


    public Lion(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String getMovement() {
        return "walks on 4 legs";
    }

}
