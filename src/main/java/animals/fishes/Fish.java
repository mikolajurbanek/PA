package animals.fishes;

import animals.Animal;
import animals.breathable;

public abstract class Fish extends Animal {

     protected Fish(String name, double mass) {
        super(name, mass);
    }


    @Override
    public String getBreathOrgan() {
        return "Breathe with gill";
    }
}
