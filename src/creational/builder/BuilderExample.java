package creational.builder;

import creational.builder.airplane.Airplane;

public class BuilderExample {

    public static void main(String [] args){


        // 또한 Director 가 사용할 Builder 는 직접 주입(Constructor, Setter) , 자체 생성(Composition) 등으로 진행해줬을 것
        // 여기선 직접 생성한다음에 생성자 주입을 해주겠다
        AirplaneBuilder fighterBuilder = new FighterBuilder("MARK");
        AirplaneBuilder gliderBuilder = new GliderBuilder("JASON");

        // 여기가 Client 객체이고, 어떤 방식으로든 Director 를 채택했을 것이다
        // 우선 FighterBuilder 를 만들고 싶다
        Engineer engineer = new Engineer(fighterBuilder); // Engineer 도 역할체로 만들 수도 있을 듯

        /*
         사실 정말 안좋은 것, 합쳐져야 한다
         생성을 위한 조건인 construct 가 필요? -> 절차지향
         */
        engineer.constructAirplane();
        Airplane fighterAirplane = engineer.getAirplane();
        System.out.println("생성된 비행기 type: " + fighterAirplane.getType());

        // 이번엔 GliderBuilder 를 만들고 싶다
        engineer.setAirplaneBuilder(gliderBuilder);
        engineer.constructAirplane();
//        Airplane gliderAirplane = engineer.getAirplane();
//        System.out.println("생성된 비행기 type: " + gliderAirplane.getType());

    }
}
