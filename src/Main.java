import beepers.*;
import cars.*;
import engines.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Beeper trainHorn = new TrainHorn();
        Engine engineV12 = new EngineV12();

        Lambo lambo = new Lambo(trainHorn, engineV12);

        System.out.println(lambo.beeper.makeSound());

    }
}
