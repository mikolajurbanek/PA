package animals.fishes;

import animals.movable;

public class Piranha extends Fish {


    public Piranha(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String getMovement() {
        return "swim with plum plum";
    }

}
