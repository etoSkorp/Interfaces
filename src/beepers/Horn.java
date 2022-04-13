package beepers;

public class Horn implements Beeper {

    @Override
    public String makeSound() {
        return "Beeper: Chooooooo";
    }
}
