package Archive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while(true){
            System.out.println("Id: (empty will stop)");
            String id = scanner.nextLine();

            if(id.isEmpty()){
                break;
            }

            System.out.println("Name? ");
            String name = scanner.nextLine();

            Archive archive = new Archive(name, id);

            if(!(archives.contains(archive.getId()))){
                archives.add(archive);
            }
        }

        System.out.println("==Items==");

        for(Archive archive: archives){
            System.out.println(archive);
        }

    }
}
