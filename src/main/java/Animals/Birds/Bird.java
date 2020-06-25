package Animals.Birds;

import Animals.Animal;

public abstract class Bird extends Animal {


    private String breathOrgan;

    protected Bird(String name, int mass) {
        super(name, mass);
        this.breathOrgan = "lungs";
    }

    @Override
    public String getBreathOrgan() {
        return String.format("Breathe with %s", breathOrgan);
    }


}
