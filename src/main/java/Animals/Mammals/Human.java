package Animals.Mammals;

import Animals.Mammals.Mammal;

public class Human extends Mammal {

    String name;
    int mass;

    public Human(String name, int mass) {
        super(name, mass);
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getInfoAbout() {
        return "walks on 2 legs";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
