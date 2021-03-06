package engines;

public class EngineV6 implements Engine {

    private final float fuelConsumption = 10.5f;

    @Override
    public float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String displacement() {
        return "Displacement is: " + 3.2f + "L";
    }

    @Override
    public int engineSpeed() {
        return 6500;
    }

    @Override
    public String octaneNumber() {
        return "RON is: 95";
    }
}
