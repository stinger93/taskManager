import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nexId;

    public TaskManager(){
        tasks = new ArrayList<>();
        nexId = 1;
    }

    //удаление задачи по id
    public void removeTask(int id){
        tasks.removeIf(task -> task.getId() == id);
    }

    //отметка задачи, как выполненой
    public void markTaskAsCompleted(int id){
        for (Task task : tasks ){
            if (task.getId() == id){
                task.setCompleted(true);
                break;
            }
        }
    }

    // Получение списка всех задач
    public List<Task> getAllTasks(){
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



