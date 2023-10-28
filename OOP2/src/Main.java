import AbstractFactory.ModernFactory;
import AbstractFactory.ClassicFactory;
import AbstractFactory.MinimalisticFactory;

public class Main {
    public static void main(String[] args) {
        ModernFactory modernFactory = new ModernFactory();
        modernFactory.createChair();
        modernFactory.createCloset();

        ClassicFactory classicFactory = new ClassicFactory();
        classicFactory.createChair();
        classicFactory.createCloset();

        MinimalisticFactory minimalisticFactory = new MinimalisticFactory();
        minimalisticFactory.createChair();
        minimalisticFactory.createCloset();
    }
}