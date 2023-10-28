package AbstractFactory;

public class ClassicFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Closet createCloset() {
        return new ClassicCloset();
    }
}
