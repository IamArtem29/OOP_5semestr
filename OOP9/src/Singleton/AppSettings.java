package Singleton;

public class AppSettings {
    private static AppSettings instance;

    private String version;
    private int maxUsers;

    private AppSettings() {
        version = "beta - 0.1";
        maxUsers = 10;
    }

    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
}
