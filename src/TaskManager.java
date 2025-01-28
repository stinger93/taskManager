import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    // Добавление задачи
    public void addTask(String description) {
        Task task = new Task(nextId++, description);
        tasks.add(task);
    }

    // Удаление задачи по ID
    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    // Отметка задачи как выполненной
    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                break;
            }
        }
    }

    // Получение списка всех задач
    public List<Task> getAllTasks() {
        return tasks;
    }

    // Получение списка активных задач
    public List<Task> getActiveTasks() {
        List<Task> activeTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                activeTasks.add(task);
            }
        }
        return activeTasks;
    }

    // Получение списка выполненных задач
    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }
}



