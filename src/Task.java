public class Task {
    private int id;
    private String description;
    public boolean isCompleted;

    public Task (int id, String description){
        this.id = id;
        this.description = description;
        this.isCompleted = false; //Поумолчанияю не выоплнено
    }

    //Геттеры и Сеттеры

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toStirng(){
        return "Task{" +
                "id=" + id +
                ", description=' " + description  + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

}
