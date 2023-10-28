import Prototype.Prototype;
import Prototype.TaskManager;
import Prototype.Task;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTaskPrototype("task1", new Task("Task 1", "Description 1"));
        taskManager.addTaskPrototype("task2", new Task("Task 2", "Description 2"));

        Prototype clone1 = taskManager.getTaskClone("task1");
        Prototype clone2 = taskManager.getTaskClone("task2");

        System.out.println(clone1);
        System.out.println(clone2);
    }
}