package animals.birds;

import animals.Animal;
import animals.InfoAbout;

public abstract class Bird extends Animal {

    private String breathOrgan;

    protected Bird(String name, double mass) {
        super(name, mass);
        this.breathOrgan = "lungs";
    }

    @Override
    public String getBreathOrgan() {
        return String.format("Breathe with %s", breathOrgan);
    }


}
