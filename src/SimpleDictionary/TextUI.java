package SimpleDictionary;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        while (true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(input.equalsIgnoreCase("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);

            }
            else if(input.equalsIgnoreCase("search")){
                System.out.println("To be translated: ");
                String search = scanner.nextLine();
                if(dictionary.translate(search) == null){
                    System.out.println("Word " + search + " was not found");
                }
                else{
                    System.out.println("Translation: " + dictionary.translate(search));
                }
            }
            else{
                System.out.println("Unknown command");
            }


        }
    }
}
