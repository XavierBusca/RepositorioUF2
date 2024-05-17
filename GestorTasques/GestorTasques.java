import java.util.HashMap;

import java.util.ArrayList;

class GestorTasques

{

	HashMap<String, ArrayList<Task>> lists;

	HashMap<Integer, Task> tasks;


	public GestorTasques() {

    	lists = new HashMap<String, ArrayList<Task>>();

    	lists.put("Baja", new ArrayList<Task>());

    	lists.put("Madia", new ArrayList<Task>());

    	lists.put("Alta", new ArrayList<Task>());

    	tasks = new HashMap<Integer, Task>();

	}


	public void AfegirTasca(String NameTask, String prioritat) {

    	Task task = new Task(NameTask);

    	lists.get(prioritat).add(task);

	}

	public void MarcarTasca(int idTask) {

    	tasks.get(idTask).done();

	}

	public void EsborrarTasca(int idTask) {

    	tasks.remove(idTask);

	}

	public void MostrarTasca() {

    	for (Task task : tasks.values()) {

        	System.out.println(task.getId());

        	System.out.println(task.getName());

        	System.out.println(task.isDone());

    	}

	}

	public void MostrarTascaPrioritat(String prioritat) {

    	for (Task task : lists.get(prioritat)) {

        	System.out.println(task);

    	}

	}
    public static void main(String[] args) {

    	GestorTasques manager = new GestorTasques();

    	manager.AfegirTasca("Aprobar Programacion", "Alta");

    	manager.MostrarTasca();

    	manager.MostrarTascaPrioritat("Alta");

    	manager.MarcarTasca(1);

    	manager.MostrarTasca();

    	manager.EsborrarTasca(1);

    	manager.MostrarTasca();

	}

}

class Task

{

	private static int numInstances = 0;

	private int id;

	private String name;

	private boolean isDone;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDone() {
        return this.isDone;
    }

	public Task(String name) {

    	this.name = name;

    	this.isDone = false;

    	numInstances++;

    	this.id = numInstances;

	}

	public void done() {

    	this.isDone = true;

	}

}
