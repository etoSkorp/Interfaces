package trucks;

public class SemiTrailerTruck implements Trucks{

    private final float truckLength = 13.6f; // длина полуприцепа
    private final float truckWidth = 2.45f; // ширина полуприцепа
    private final float truckHeight = 2.5f; // высота полуприцепа
    private int cost; // цена полуприцепа

    public SemiTrailerTruck(int cost) {
        setCost(cost);
    }

    void setCost(int cost) {
        if (cost > 0)
            this.cost = cost;
        else {
            System.out.println("Incorrect value: " + cost);
            this.cost = 1_500_000;
        }

    }

    @Override
    public int getIssueYear() {
        return 2007;
    }

    @Override
    public int truckSpace() {
        return (int) (truckLength * truckWidth * truckHeight * 1_000_000);
    }

    @Override
    public float getDimensions() {
        return truckLength * truckHeight * truckWidth;
    }

    @Override
    public String getCarrying() {
        return "20000kg";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String brakeType() {
        if (cost >= 1_300_000)
            return "Disc brakes";
        else
            return "Drum brakes";
    }
}
