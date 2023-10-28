package AbstractFactory;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Closet createCloset() {
        return new ModernCloset();
    }
}
