import java.util.ArrayList;
import java.util.List;

public abstract class Animal {


    private String breathingOrgan;


    private List<Mammal> mammals = new ArrayList<Mammal>();
    private List<Bird> birds = new ArrayList<Bird>();
    private List<Fish> fish = new ArrayList<Fish>();

    public Animal(String breathingOrgan){
        this.breathingOrgan = breathingOrgan;

    }

    abstract String breathWith();




}
