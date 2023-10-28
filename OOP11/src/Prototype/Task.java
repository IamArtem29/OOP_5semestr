package Prototype;

public class Task implements Prototype {
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Prototype clone() {
        return new Task(this.name, this.description);
    }

    @Override
    public String toString() {
        return "Task: " + name + ", Description: " + description;
    }
}