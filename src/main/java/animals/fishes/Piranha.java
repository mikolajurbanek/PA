package animals.fishes;

public class Piranha extends Fish {


    public Piranha(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String getMovement() {
        return "swims with plum plum";
    }

}
