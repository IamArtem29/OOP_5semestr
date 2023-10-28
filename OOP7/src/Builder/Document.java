package Builder;

public class Document {
    String chapter;
    String text;

    public Document(DocumentBuilder documentBuilder) {
        chapter = documentBuilder.chapter;
        text = documentBuilder.text;
    }

    public static class DocumentBuilder {
        String chapter;
        String text;

        public DocumentBuilder(String chapter) {
            this.chapter = chapter;
        }

        public DocumentBuilder setText(String text) {
            this.text = text;
            return this;
        }

        public Document build() {
            return new Document(this);
        }
    }
}