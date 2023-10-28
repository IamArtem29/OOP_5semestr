package Bridge;

public class Smartphone extends Device {
    public Smartphone(DeviceSystem deviceSystem) {
        super(deviceSystem);
    }

    @Override
    public void use() {
        System.out.println("Using Smartphone");
        deviceSystem.systemUse();
    }
}
