package Observer;

interface Chat {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendMessage(String message);
}