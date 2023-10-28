import Observer.ChatGroup;
import Observer.User;

public class Main {
    public static void main(String[] args) {
        ChatGroup memes = new ChatGroup();
        ChatGroup news = new ChatGroup();

        User user1 = new User("Artem");
        User user2 = new User("Ivan");

        memes.addObserver(user1);
        memes.addObserver(user2);
        news.addObserver(user1);
        memes.removeObserver(user1);

        memes.sendMessage("dank meme");
        memes.sendMessage("unfunny meme");
        news.sendMessage("news");
    }
}