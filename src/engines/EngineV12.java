package engines;

public class EngineV12 implements Engine {

    private final float fuelConsumption = 15.5f;

    @Override
    public float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String displacement() {
        return "Displacement is: " + 5.5f + "L";
    }

    @Override
    public int engineSpeed() {
        return 8500;
    }

    @Override
    public String octaneNumber() {
        return "RON is: 98";
    }
}
