package animals.birds;


public class Raven extends Bird {


    public Raven(String name, int mass) {
        super(name, mass);

    }

    @Override
    public String getInfoAbout() {
        return "flies with fru fru!";
    }

}
