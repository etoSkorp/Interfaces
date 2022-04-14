package trucks;

public class BoxTruck implements Trucks{
    private final float boxTruckLength = 6f; // длина полуприцепа
    private final float boxTruckWidth = 1.95f; // ширина полуприцепа
    private final float boxTruckHeight = 2.1f; // высота полуприцепа
    private int cost; // цена полуприцепа

    public BoxTruck(int cost) {
        setCost(cost);
    }

    void setCost(int cost) {
        if (cost > 0)
            this.cost = cost;
        else {
            System.out.println("Incorrect value: " + cost);
            this.cost = 700_000;
        }

    }

    @Override
    public int getIssueYear() {
        return 1998;
    }

    @Override
    public int truckSpace() {
        return (int) (boxTruckLength * boxTruckWidth * boxTruckHeight * 1_000_000);
    }

    @Override
    public float getDimensions() {
        return boxTruckLength * boxTruckWidth * boxTruckHeight;
    }

    @Override
    public String getCarrying() {
        return "3500kg";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String brakeType() {
        if (cost >= 1_000_000)
            return "Disc brakes";
        else
            return "Drum brakes";
    }
}
