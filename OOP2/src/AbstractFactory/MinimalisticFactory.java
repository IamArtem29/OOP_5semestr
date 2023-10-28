package AbstractFactory;

public class MinimalisticFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MinimalisticChair();
    }

    @Override
    public Closet createCloset() {
        return new MinimalisticCloset();
    }
}
