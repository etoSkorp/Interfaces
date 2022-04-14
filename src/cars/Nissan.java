package cars;

import beepers.Beeper;
import engines.Engine;
import fuelSystems.FuelSystem;

public class Nissan extends Car {

    public Nissan(Beeper beeper, Engine engine, FuelSystem fuelSystem) {
        super(beeper, engine, fuelSystem);
    }

    public String dimension() {
        final int dimension = 4377;
        return "Dimension is: " + dimension + "mm";
    }

    public String bootSpace() {
        final int bootSpace = 430;
        return "Boot space is: " + bootSpace + " liters.";
    }
}
