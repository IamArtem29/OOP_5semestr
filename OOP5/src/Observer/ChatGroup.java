package Observer;
import java.util.ArrayList;
import java.util.List;

public class ChatGroup implements Chat {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Send message: " + message);
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}