public abstract class Bird extends Animal {


    private String sound;

    public Bird(String breathingOrgan, String sound) {
        super(breathingOrgan);
        this.sound = sound;
    }

    @Override
    String breathWith() {
        return "lungs";
    }
}
