package Animals.Fishes;

import Animals.Animal;

public abstract class Fish extends Animal {

    private String breathOrgan;



    protected Fish(String name, int mass) {
        super(name, mass);
        this.breathOrgan = "gill";

    }


    @Override
    public String getBreathOrgan() {
        return String.format("Breathe with %s", breathOrgan);
    }


}
