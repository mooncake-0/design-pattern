package creational.builder;

import creational.builder.airplane.Airplane;

public class Engineer {

    private AirplaneBuilder airplaneBuilder;

    public Engineer(AirplaneBuilder airplaneBuilder) {
        // 생성시점에 사용할 Builder 가 주입된다ㅡ ㅜ
        this.airplaneBuilder = airplaneBuilder;
    }

    public void setAirplaneBuilder(AirplaneBuilder airplaneBuilder) {
        // 원하는 Builder 로 바꿀 수 있다
        this.airplaneBuilder = airplaneBuilder;
    }

    public void constructAirplane() {
        // AirplaneBuilder 가 계속 생성되는게 아니라
        // 하나만 존재할 경우, 새로운 객체를 준비해줘야 하므로 create 를 따로 빼준다
        this.airplaneBuilder.createNewAirplane();
        this.airplaneBuilder.buildWings();
        this.airplaneBuilder.buildPowerplant();
        this.airplaneBuilder.buildSeats();

    }

    // Client 는 Builder 에 관심이 없으므로 Engineer 에게
    // 최종 Product 를 달라고 요구한다
    public Airplane getAirplane() {
        return this.airplaneBuilder.getAirplane();
    }

}
