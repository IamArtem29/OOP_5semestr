import Builder.Document;

public class Main {
    public static void main(String[] args) {
        Document document = new Document.DocumentBuilder("Chapter").setText("description").build();
    }
}