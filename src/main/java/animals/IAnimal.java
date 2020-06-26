package animals;

public interface IAnimal extends breathable, movable {

    String getName();

    void setName(String name);

    double getMass();

    void setMass(double mass);


}
