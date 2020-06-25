package Animals.Birds;


public class Raven extends Bird {

    String name;
    int mass;


    public Raven(String name, int mass) {
        super(name, mass);
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getInfoAbout() {
        return "flies with fru fru!";
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
