package ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList(){
        this.tasks = new ArrayList<>();

    }

    public void add(String task){
            tasks.add(task);

    }
    public void print(){
        for(String task : tasks){
            int i = tasks.indexOf(task) + 1;
            System.out.println( i + ": " + task);
        }
    }
    public void remove(int number){
        tasks.remove(number - 1);

    }
}
