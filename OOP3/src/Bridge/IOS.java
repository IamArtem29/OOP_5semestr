package Bridge;

public class IOS implements DeviceSystem {
    @Override
    public void systemUse() {
        System.out.println("with IOS");
    }
}
