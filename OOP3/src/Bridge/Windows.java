package Bridge;

public class Windows implements DeviceSystem {
    @Override
    public void systemUse() {
        System.out.println("with Windows");
    }
}
