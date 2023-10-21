package creational.builder;

import creational.builder.airplane.AirplanePowerplant;
import creational.builder.airplane.AirplaneSeat;
import creational.builder.airplane.AirplaneWing;

// 객체 생성을 Builder 패턴으로 가져가겠다고 했으니 아예 상속시킬 수 있는 것임
public class GliderBuilder extends AirplaneBuilder{

    GliderBuilder(String customer) {
        super.customer = customer;
        super.type = "GLIDER";
    }


    @Override
    public void createNewAirplane() {

    }

    @Override
    public void buildWings() {
        // 사실 GliderBuilder 용 Wing 이여야 할 것이다
        super.airplane.setWing(new AirplaneWing());
    }

    @Override
    public void buildPowerplant() {
        // 사실 GliderBuilder 용 Powerplant 이여야 할 것이다
        super.airplane.setPowerplant(new AirplanePowerplant());
    }

    @Override
    public void buildSeats() {
        // 사실 GliderBuilder 용 Seat 이여야 할 것이다
        super.airplane.setSeat(new AirplaneSeat());
    }

}
