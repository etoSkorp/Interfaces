package cars;

import beepers.Beeper;
import engines.Engine;
import fuelSystems.FuelSystem;

public abstract class Car {

    public Beeper beeper;
    public Engine engine;
    public FuelSystem fuelSystem;

    public Car(Beeper beeper, Engine engine, FuelSystem fuelSystem) {
        this.beeper = beeper;
        this.engine = engine;
        this.fuelSystem = fuelSystem;
    }
}
