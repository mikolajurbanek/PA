import animals.Animal;
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


        mammals.add(lion);
        mammals.add(human);
        System.out.println("Mammals:");
        for (Mammal mammal: mammals) {
            System.out.println(mammal.toString());
        }
        System.out.println();

        System.out.println("Lion " + lion.getBreathOrgan());
        System.out.println("Lion " + lion.getMovement());
        System.out.println("Raven " + raven.getMovement());
        System.out.println("Human " + human.getMovement());
        System.out.println("Piranha"  + fish.getMovement());
        System.out.println("Piranha name is " + fish.getName());
        System.out.println("Tweety has " + raven.getMass() + "kg");



    }
}
