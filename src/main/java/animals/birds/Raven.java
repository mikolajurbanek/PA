package animals.birds;


import animals.movable;

public class Raven extends Bird {


    public Raven(String name, double mass) {
        super(name, mass);

    }

    @Override
    public String getMovement() {
        return "flies with fru fru!";
    }

}
