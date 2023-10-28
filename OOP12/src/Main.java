import Composite.File;
import Composite.Folder;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Folder folder1 = new Folder("Folder 1");
        Folder folder2 = new Folder("Folder 2");
        Folder rootFolder = new Folder("Root");

        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);
        folder1.removeComponent(file2);
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        rootFolder.printName();
    }
}