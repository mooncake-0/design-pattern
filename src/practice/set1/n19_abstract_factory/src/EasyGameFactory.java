package practice.set1.n19_abstract_factory.src;

public class EasyGameFactory implements GameFactory {

    @Override
    public Gem getGem() {
        return new EasyGem();
    }

    @Override
    public Maze getMaze() {
        return new EasyMaze();
    }
}
