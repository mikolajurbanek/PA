package animals.fishes;

import animals.Animal;

public abstract class Fish extends Animal {



    Fish(String name, double mass) {
        super(name, mass);

    }


    @Override
    public String getBreathOrgan() {
        return "Breathe with gill";
    }


}
