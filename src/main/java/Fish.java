public abstract class Fish extends Animal {



    public Fish(String breathingOrgan, String swim) {
        super(breathingOrgan);

    }

    @Override
    String breathWith() {
        return "gill";
    }
}
