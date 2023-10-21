package creational.builder;

import creational.builder.airplane.Airplane;

public abstract class AirplaneBuilder {

    protected Airplane airplane;
    protected String customer;
    protected String type;

    public Airplane getAirplane() {
        return this.airplane;
    }

    public abstract void createNewAirplane();

    public abstract void buildWings();

    public abstract void buildPowerplant();

    public abstract void buildSeats();


}
