package cars;

import beepers.Beeper;
import engines.Engine;
import fuelSystems.FuelSystem;

public class Lada extends Car {

    public Lada(Beeper beeper, Engine engine, FuelSystem fuelSystem) {
        super(beeper, engine, fuelSystem);
    }

    public String downShifting() {
        return "Get Low";
    }
}
