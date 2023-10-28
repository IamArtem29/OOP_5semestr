package Memento;

public class PaintMemento {
    private String paintState;

    public PaintMemento(String paintState) {
        this.paintState = paintState;
    }

    public String getState() {
        return paintState;
    }

}