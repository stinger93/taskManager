public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        //Добавление новых задач
        manager.addTask("Купить молоко");
        manager.addTask("Сделать домашнее задание");
        manager.addTask("Позвонить другу");

        // Отметка задачи, как выполненной
        manager.markTaskAsCompleted(2);

        //Вывод всех задач
        System.out.println("Все задчаи");
        for (Task task : manager.getAllTasks()) {
            System.out.println(task);
        }

        // вывод активных задач
        System.out.println("\\nАктивные задачи:");
        for (Task task : manager.getActiveTasks()){
            System.out.println(task);
        }

        manager.removeTask(1);
        System.out.println("\nЗадачи после удаления:");
        for (Task task : manager.getAllTasks()){
            System.out.println(task);
        }
    }
}