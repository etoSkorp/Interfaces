package trucks;

public interface Trucks {

    int getIssueYear(); // год выпуска

    int truckSpace(); // объем полуприцепа

    float getDimensions(); // габариты полуприцепа

    String getCarrying(); // грузоподъемность

    int getCost(); // стоимость по рынку

    String brakeType(); // тип тормозов
}
