package freightTransport;

import engines.Engine;
import trucks.Trucks;

public abstract class FreightTransport {

    public Engine engine;
    public Trucks trucks;

    public FreightTransport(Engine engine, Trucks trucks) {
        this.engine = engine;
        this.trucks = trucks;
    }

}
