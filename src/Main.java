import beepers.Beeper;
import beepers.TrainHorn;
import cars.Lambo;
import engines.Engine;
import engines.EngineV12;

public class Main {

    public static void main(String[] args) {
//
        Beeper trainHorn = new TrainHorn();
        Engine engineV12 = new EngineV12();

        Lambo lambo = new Lambo(trainHorn, engineV12);

        System.out.println(lambo.beeper.makeSound());

    }
}
