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

    public void markTaskAsCompleted(int id){
        for (Task task : tasks ){
            if (task.getId() == id){
                task.setCompleted(true);
                break;
            }
        }
    }

}
