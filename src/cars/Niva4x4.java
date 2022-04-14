package cars;

import beepers.Beeper;
import engines.Engine;
import fuelSystems.FuelSystem;

public class Niva4x4 extends Car{

    public Niva4x4(Beeper beeper, Engine engine, FuelSystem fuelSystem) {
        super(beeper, engine, fuelSystem);
    }

    public String groundClearance() {
        int groundClearance = 220;
        return "Ground clearance is: " + groundClearance + "mm";
    }
}
