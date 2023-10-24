package practice.set1.n19_abstract_factory.src;

public class NormalGameFactory implements GameFactory {

    @Override
    public Gem getGem() {
        return new NormalGem();
    }

    @Override
    public Maze getMaze() {
        return new NormalMaze();
    }
}
