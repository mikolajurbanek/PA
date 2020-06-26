import animals.Animal;
import animals.IAnimal;
import animals.birds.Bird;
import animals.birds.Raven;
import animals.fishes.Fish;
import animals.fishes.Piranha;
import animals.mammals.Human;
import animals.mammals.Lion;
import animals.mammals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // TODO dodać pakiety
        // TODO stworzyć interfacy, które bedą implementowane przez klasy
        //TODO oddychenie i poruszanie jest Stringiem, bez sensu rozgraniczać

        List<Mammal> mammals = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();
        List<Fish> fishes = new ArrayList<>();

        Mammal lion = new Lion("Leon", 25);
        Bird raven = new Raven("Tweety", 0.3);
        Mammal human = new Human("Mikołaj", 75);
        Fish fish = new Piranha("Piranha", 1);


        mammals.add(human);
        System.out.println(raven.getMass());
        System.out.println(lion.getBreathOrgan());
        System.out.println(lion.getMovement());
        System.out.println(raven.getMovement());
        System.out.println(human.getMovement());
        System.out.println(fish.getMovement());
        fish.setName("rybka");
        System.out.println(fish.getName());



    }
}
