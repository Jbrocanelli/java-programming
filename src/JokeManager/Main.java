package JokeManager;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(manager, scanner);
        System.out.println("What a joke!");
        userInterface.start();
    }
}
