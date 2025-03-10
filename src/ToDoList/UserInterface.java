package ToDoList;

import java.util.Scanner;

public class UserInterface {
    private ToDoList list;
    private Scanner scanner;

    public UserInterface(ToDoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("stop")){
                break;
            } else if (input.equalsIgnoreCase("add")) {
                System.out.println("To add: ");
                String item = scanner.nextLine();
                list.add(item);
            } else if (input.equalsIgnoreCase("list")) {
                list.print();
            } else if (input.equalsIgnoreCase("remove")) {
                System.out.println("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                list.remove(toRemove);
            }

        }
    }
}
