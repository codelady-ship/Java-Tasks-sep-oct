package tasklar.SentyabrTask.OOP2ToDo;

import java.util.ArrayList;
import java.util.List;

//Storage
public class TaskRepository {
public List<Task> tasks = new ArrayList<Task>();

    public void addTask(Task task){
    tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
