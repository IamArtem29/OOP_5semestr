package Prototype;

import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private Map<String, Prototype> Prototypes = new HashMap<>();

    public void addTaskPrototype(String key, Prototype task) {
        Prototypes.put(key, task);
    }

    public Prototype getTaskClone(String key) {
        Prototype prototype = Prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}