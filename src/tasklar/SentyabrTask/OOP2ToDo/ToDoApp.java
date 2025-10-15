package tasklar.SentyabrTask.OOP2ToDo;

public class ToDoApp {
    private TaskRepository repository;

    public ToDoApp() {
        this.repository = new TaskRepository();
    }

    public void addTask(String description) {
        repository.addTask(new Task(description));
   }
    public String exportTasks(Exporter exporter) {
     return exporter.export(repository.getAllTasks());
    }
    public TaskRepository getRepository() {
        return repository;
    }

}
