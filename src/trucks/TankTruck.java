package trucks;

public class TankTruck implements Trucks{

    private final float tankTruckLength = 9.05f; // длина полуприцепа
    private final float tankTruckWidth = 2.5f; // ширина полуприцепа
    private final float tankTruckHeight = 3.77f; // высота полуприцепа
    private int cost; // цена полуприцепа

    public TankTruck(int cost) {
        setCost(cost);
    }

    void setCost(int cost) {
        if (cost > 0)
            this.cost = cost;
        else {
            System.out.println("Incorrect value: " + cost);
            this.cost = 2_500_000;
        }

    }

    @Override
    public int getIssueYear() {
        return 2012;
    }

    @Override
    public int truckSpace() {
        return (int) (tankTruckLength * tankTruckWidth * tankTruckHeight * 1_000_000);
    }

    @Override
    public float getDimensions() {
        return tankTruckLength * tankTruckWidth * tankTruckHeight;
    }

    @Override
    public String getCarrying() {
        return "7500 gallons";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String brakeType() {
        if (cost >= 2_400_000)
            return "Disc brakes";
        else
            return "Drum brakes";
    }
}
