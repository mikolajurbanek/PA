package animals.mammals;

public class Human extends Mammal {


    public Human(String name, double mass) {
        super(name, mass);
    }


    @Override
    public String getInfoAbout() {
        return "walks on 2 legs";
    }

}
