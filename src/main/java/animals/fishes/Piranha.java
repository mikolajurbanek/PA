package animals.fishes;

public class Piranha extends Fish {


    public Piranha(String name, double mass) {
        super(name, mass);
    }

    @Override
    public String getInfoAbout() {
        return "swim with plum plum";
    }

}
