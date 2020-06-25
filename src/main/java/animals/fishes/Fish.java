package animals.fishes;

import animals.Animal;

public abstract class Fish extends Animal {

    private String breathOrgan;



    protected Fish(String name, double mass) {
        super(name, mass);
        this.breathOrgan = "gill";

    }


    @Override
    public String getBreathOrgan() {
        return String.format("Breathe with %s", breathOrgan);
    }


}
