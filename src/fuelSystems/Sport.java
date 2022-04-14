package fuelSystems;

import engines.Engine;

public class Sport implements FuelSystem{

    final int fuelTank = 60;

    private final float sportFuelConsumption;

    public Engine engine;

    public Sport(Engine engine) {
        this.engine = engine;
        this.sportFuelConsumption = engine.getFuelConsumption() * 1.2f;
    }

    @Override
    public int fuelTank() {
        return fuelTank;
    }

    @Override
    public float powerReserve() {
        return fuelTank / sportFuelConsumption * 100;
    }

    @Override
    public String getSpeed() {
        return "Max speed: 250km/h";
    }
}
