package ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(list, scanner);

        userInterface.start();

    }
}
