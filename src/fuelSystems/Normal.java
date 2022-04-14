package fuelSystems;

import engines.Engine;

public class Normal implements FuelSystem{

    final int fuelTank = 60;

    private final float normalFuelConsumption;

    public Engine engine;

    public Normal(Engine engine) {
        this.engine = engine;
        this.normalFuelConsumption = engine.getFuelConsumption();
    }

    @Override
    public int fuelTank() {
        return fuelTank;
    }

    @Override
    public float powerReserve() {
        return fuelTank / normalFuelConsumption * 100;
    }

    @Override
    public String getSpeed() {
        return "Max speed: 220km/h";
    }
}
