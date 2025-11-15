package tasklar.SentyabrTask.OOP2ToDo;

import java.util.List;

public class HTMLExporter implements Exporter {
    @Override
    public String export(List<Task> tasks) {
        StringBuilder sb = new StringBuilder("<ul>\n");
        for (Task task : tasks) {
            sb.append("  <li>")
                    .append(task.getDescription())
                    .append(" - <strong>")
                    .append(task.isCompleted() ? "Done" : "Pending")
                    .append("</strong></li>\n");
        }
        sb.append("</ul>");
        return sb.toString();
    }
}

