import beepers.*;
import cars.*;
import engines.*;
import freightTransport.Gazelle;
import freightTransport.Truck;
import fuelSystems.Eco;
import fuelSystems.Normal;
import fuelSystems.Sport;
import trucks.BoxTruck;
import trucks.SemiTrailerTruck;

public class Main {

    public static void main(String[] args) {

        Horn horn = new Horn();
        TrainHorn trainHorn = new TrainHorn();
        EngineV6 engineV6 = new EngineV6();
        EngineV12 engineV12 = new EngineV12();
        InlineFour inlineFour = new InlineFour();
        Eco eco = new Eco(inlineFour);
        Normal normal = new Normal(engineV6);
        Sport sport = new Sport(engineV12);
        SemiTrailerTruck semiTrailerTruck = new SemiTrailerTruck(1_700_000);
        BoxTruck boxTruck = new BoxTruck(500000);


        Lambo lambo = new Lambo(trainHorn, engineV12, sport);

        System.out.println("\nLambo:");
        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.getCost());
        System.out.printf("Power reserve is: %.2f km\n", lambo.fuelSystem.powerReserve());

        Nissan qashqai = new Nissan(horn, inlineFour, eco);

        System.out.println("\nQashqai:");
        System.out.println(qashqai.dimension());
        System.out.println(qashqai.engine.displacement());
        System.out.println(qashqai.bootSpace());
        System.out.printf("Power reserve is: %.2f km\n", qashqai.fuelSystem.powerReserve());

        Niva4x4 niva = new Niva4x4(horn, inlineFour, normal);

        System.out.println("\nNiva:\n" + niva.groundClearance());
        System.out.println(niva.fuelSystem.getSpeed());
        System.out.println("Engine speed: " + niva.engine.engineSpeed() + "rpm");

        Gazelle gazelle = new Gazelle(inlineFour, boxTruck);

        System.out.println("\nGazelle:");
        System.out.printf("Dimensions of Box Truck: %.2f m3\n", gazelle.trucks.getDimensions());
        System.out.println("Cost: " + gazelle.trucks.getCost() + "rub");
        System.out.println("Brake type: " + gazelle.trucks.brakeType());

        Truck maz = new Truck(engineV6, semiTrailerTruck);

        System.out.println("\nSemi-trailer:");
        System.out.println("Truck space: " + maz.trucks.truckSpace() + "cm3");
        System.out.println("Load capacity: " + maz.trucks.getCarrying());
        System.out.println("Issue year: " + maz.trucks.getIssueYear());
    }
}
