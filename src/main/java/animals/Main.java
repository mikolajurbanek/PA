package animals;

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

        Animal lion = new Lion("Leon", 25);
        Animal raven = new Raven("Tweety", 1);
        Animal human = new Human("Mikołaj", 75);
        Animal fish = new Piranha("Piranha", 1);

        System.out.println(lion.getBreathOrgan());
        System.out.println(lion.getInfoAbout());
        System.out.println(raven.getInfoAbout());
        System.out.println(human.getInfoAbout());
        System.out.println(fish.getInfoAbout());
        System.out.println(fish.getName());



    }
}
