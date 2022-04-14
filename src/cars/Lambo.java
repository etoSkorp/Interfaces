package cars;

import beepers.Beeper;
import engines.Engine;
import fuelSystems.FuelSystem;

public class Lambo extends Car{

    public Lambo(Beeper beeper, Engine engine, FuelSystem fuelSystem) {
        super(beeper, engine, fuelSystem);
    }

    public String getCost() {
        return "Cost: Too expensive so you can forget about it";
    }
}
