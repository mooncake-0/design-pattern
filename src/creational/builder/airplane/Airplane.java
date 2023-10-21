package creational.builder.airplane;

public class Airplane {

    protected String customer;
    protected String type;
    protected AirplaneWing wing;
    protected AirplanePowerplant powerplant;
    protected AirplaneSeat seat;

    public Airplane(String customer, String type) {
        this.customer = customer;
        this.type = type;
    }

    public void setWing(AirplaneWing wing) {
        this.wing = wing;
    }

    public void setPowerplant(AirplanePowerplant powerplant) {
        this.powerplant = powerplant;
    }

    public void setSeat(AirplaneSeat seat) {
        this.seat = seat;
    }

    public String getType() {
        return this.type;
    }
}
