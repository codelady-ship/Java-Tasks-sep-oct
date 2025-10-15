package tasklar.SentyabrTask.OOP2ToDo;

import java.util.List;

public class PlainTextExporter implements Exporter {

    @Override
    public String export(List<Task> tasks) {
     StringBuilder sb = new StringBuilder();
        for (Task task : tasks) {
            sb.append("Task: ").append(task.getDescription())
                    .append(" | Completed: ").append(task.isCompleted() ? "Yes" : "No").append("\n");
        }
        return sb.toString();
    }
}
