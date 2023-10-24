package practice.set1.n19_abstract_factory;

import practice.set1.n19_abstract_factory.src.*;

public class MyGame {
    private GameFactory gameFactory;

    public void proceedGame() {
        for (int i = 0; i < 3; i++) {
            setGameFactory(i);
            if(playGame() == 0) break;
        }
    }

    private int playGame() {
        // Game Factory 를 사용한다
        int isSuccessful = 0;
        Maze gameMaze = gameFactory.getMaze();
        Gem gameGem = gameFactory.getGem();

        // ...

        return isSuccessful;
    }

    public void setGameFactory(int stageLevel) {
        switch (stageLevel) {
            case 0:
                gameFactory = new EasyGameFactory();
            case 1:
                gameFactory = new NormalGameFactory();
            case 2:
                gameFactory = new HardGameFactory();
        }
    }
}
