package Animals.Mammals;

import Animals.Animal;

public abstract class Mammal extends Animal {


    protected String breathOrgan;



    public Mammal(String name, int mass) {
        super(name, mass);
        this.breathOrgan = "lungs";

    }

    @Override
    public String getBreathOrgan() {
        return String.format("Breathe with %s", breathOrgan);
    }

}
