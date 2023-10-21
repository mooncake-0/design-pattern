package creational.builder;

import creational.builder.airplane.AirplanePowerplant;
import creational.builder.airplane.AirplaneSeat;
import creational.builder.airplane.AirplaneWing;
import creational.builder.airplane.Fighter;

public class FighterBuilder extends AirplaneBuilder { // Object 생성 자체를 Build 에 전담한다

    public FighterBuilder(String customer) {
        super.customer = customer;
        super.type = "FIGHTER";
    }

    @Override
    public void createNewAirplane() {
        super.airplane = new Fighter(super.customer, super.type);
    }

    @Override
    public void buildWings() {
        // 사실 FighterBuilder 용 Wing 이여야 할 것이다
        super.airplane.setWing(new AirplaneWing());
    }

    @Override
    public void buildPowerplant() {
        // 사실 FighterBuilder 용 Powerplant 이여야 할 것이다
        super.airplane.setPowerplant(new AirplanePowerplant());
    }

    @Override
    public void buildSeats() {
        // 사실 FighterBuilder 용 Seat 이여야 할 것이다
        super.airplane.setSeat(new AirplaneSeat());
    }
}
