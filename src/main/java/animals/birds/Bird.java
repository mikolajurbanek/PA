package animals.birds;

import animals.Animal;

public abstract class Bird extends Animal {


    Bird(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String getBreathOrgan() {
        return "Breathe with lungs";
    }


}
