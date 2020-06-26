package animals.birds;

import animals.Animal;
import animals.IAnimal;


public abstract class Bird extends Animal {


    protected Bird(String name, double mass) {
        super(name, mass);

    }

    @Override
    public String getBreathOrgan() {
        return "Breathe with lungs";
    }


}
