package Animals.Fishes;

import Animals.Fishes.Fish;

public class Piranha extends Fish {

    public String name;
    public int mass;




    public Piranha(String name, int mass) {
        super(name, mass);
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getInfoAbout() {
        return "swim with plum plum";
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
