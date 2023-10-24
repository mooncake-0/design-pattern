package practice.set1.n19_abstract_factory.src;

public class HardGameFactory implements GameFactory{

    @Override
    public Gem getGem() {
        return new HardGem();
    }

    @Override
    public Maze getMaze() {
        return new HardMaze();
    }
}