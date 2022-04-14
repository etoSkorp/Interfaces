package fuelSystems;

import engines.Engine;

public class Eco implements FuelSystem{

    final int fuelTank = 60;

    private final float ecoFuelConsumption;

    public Engine engine;

    public Eco(Engine engine) {
        this.engine = engine;
        this.ecoFuelConsumption = engine.getFuelConsumption() * 0.8f;
    }

    @Override
    public int fuelTank() {
        return fuelTank;
    }

    @Override
    public float powerReserve() {
        return fuelTank / ecoFuelConsumption * 100;
    }

    @Override
    public String getSpeed() {
        return "Max speed: 200km/h";
    }
}
