package Animals.Mammals;

public class Lion extends Mammal {

    private String name;
    private int mass;



    public Lion(String name, int mass) {
        super(name, mass);
        this.name = name;
        this.mass = mass;

    }
    @Override
    public String getInfoAbout() {
        return "walks on 4 legs";
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
