package Bridge;

public abstract class Device {
    protected DeviceSystem deviceSystem;

    public Device(DeviceSystem deviceSystem) {
        this.deviceSystem = deviceSystem;
    }

    public abstract void use();
}
