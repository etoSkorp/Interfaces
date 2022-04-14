package engines;

public interface Engine {

    String  displacement(); // объем двигателя
    int engineSpeed(); // обороты двигателя
    String octaneNumber(); // октановое число
    float getFuelConsumption(); // расход топлива
}
