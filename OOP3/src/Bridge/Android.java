package Bridge;

public class Android implements DeviceSystem {
    @Override
    public void systemUse() {
        System.out.println("with Android");
    }
}
