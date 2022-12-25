package liskove_substitution.solution;

public class Canary extends FlyingBirds {
    @Override
    void flySpeed() {
        System.out.println("Walk speed is 30 km/h");
    }

    @Override
    void walkSpeed() {
        System.out.println("Walk speed is 10 km/h");
    }
}
