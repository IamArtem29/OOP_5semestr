package Bridge;

public class Tablet extends Device {
    public Tablet(DeviceSystem deviceSystem) {
        super(deviceSystem);
    }

    @Override
    public void use() {
        System.out.println("Using Tablet");
        deviceSystem.systemUse();
    }
}
