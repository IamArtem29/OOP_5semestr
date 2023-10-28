package Bridge;

public class Notebook extends Device {
    public Notebook(DeviceSystem deviceSystem) {
        super(deviceSystem);
    }

    @Override
    public void use() {
        System.out.println("Using Notebook");
        deviceSystem.systemUse();
    }
}
