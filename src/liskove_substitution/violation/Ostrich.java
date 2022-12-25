package liskove_substitution.violation;

// The class will work fine but there is mis relation
// Ostrich is a bird but can't fly
// The class will works fine but will give unexpected result
public class Ostrich extends Bird {
    @Override
    void fly(int speed) {
        System.out.println(speed);
    }
}
