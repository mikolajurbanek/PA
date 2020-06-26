package animals.mammals;

import animals.Animal;

public abstract class Mammal extends Animal {



    protected Mammal(String name, double mass) {
        super(name, mass);

    }

    @Override
    public String getBreathOrgan() {
        return "Breathe with lungs";
    }

}
