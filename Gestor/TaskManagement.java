class TaskManagment
{
    HashMap<String, ArrayList<Task>> lists;
    HashMap<int, Task> tasks;
    public TaskManagment() {
        lists = new HashMap<String, ArrayList<Task>>();
        lists.put("Baja", new ArrayList<Task>>());
        lists.put("Media", new ArrayList<Task>>());
        lists.put("Alta", new ArrayList<Task>>());
        tasks = new HashMap<int, Task>();
    }

    public void addTask(String taskName, String priority) {
        Task task = new Task(taskName);
        lists.get(priority).add(task);
    }
    
    public void doneTask(int taskId) {
        tasks.get(taskId).done();
    }

    public void deleteTask(int taskId) {
        tasks.remove(taskId);
    }

    public void printAllTask() {
        for (task: tasks) {
            print(task.getId());
            print(task.getName());
            println(task.isDone());
        }
    }

    public void printTaskByPriority(String priority) {
        for (task: lists.get(priority)) {
            println(task);
        }
    }
}

class Task
{
    private static numInstances = 0;
    private int id;
    private String name;
    private bool isDone;

    public Task(String name) {
        this.name = name;
        this.isDone = false;
        this.id = ++numInstances;
    }
    public void done(){
        this.isDone = True;;
    }
}
class main
{
    public void main(String[] args) {
        TaskManagment manager = new TaskManagment();
        manager.addTask("Aprobar programacion" , "Alta");
        manager.printAllTask();
        manager.printTaskByPriority("Alta");
        manager.doneTask(1);
        manager.printAllTask();
        manager.deleteTask(1);
        manager.printAllTask();
    }
}