import Singleton.AppSettings;

public class Main {
    public static void main(String[] args) {
        AppSettings settings = AppSettings.getInstance();

        System.out.println("Max users: " + settings.getMaxUsers());
        System.out.println("Version: " + settings.getVersion());

        settings.setMaxUsers(20);
        settings.setVersion("beta - 0.2");

        System.out.println("Max users: " + settings.getMaxUsers());
        System.out.println("Version: " + settings.getVersion());
    }
}