package animals;

public abstract class Animal implements IAnimal {

    private String name;
    private double mass;

    protected Animal(String name, double mass){
        this.name = name;
        this.mass = mass;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
