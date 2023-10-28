import Bridge.IOS;
import Bridge.Android;
import Bridge.Windows;
import Bridge.Smartphone;
import Bridge.Tablet;
import Bridge.Notebook;

public class Main {
    public static void main(String[] args) {
        IOS ios = new IOS();
        Windows windows = new Windows();
        Android android = new Android();

        Tablet tablet = new Tablet(ios);
        tablet.use();

        Notebook notebook = new Notebook(windows);
        notebook.use();

        Smartphone smartphone = new Smartphone(android);
        smartphone.use();
    }
}