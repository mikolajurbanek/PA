public abstract class Mammal extends Animal {



    public Mammal(String breathingOrgan, int legsNumber) {
        super(breathingOrgan);

    }

    abstract String legsNumber();


    @Override
    String breathWith() {
        return "lungs";
    }
}
