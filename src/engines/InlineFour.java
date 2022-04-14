package engines;

public class InlineFour implements Engine{

    private final float fuelConsumption = 8.5f;

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String displacement() {
        return "Displacement is: " + 2.0f + "L";
    }

    @Override
    public int engineSpeed() {
        return 5000;
    }

    @Override
    public String octaneNumber() {
        return "RON is: 92";
    }
}
