package Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if(name.isEmpty()){
                for(Item item: items){
                    System.out.println(item);
                }
                break;
            }
            else{
                items.add(new Item(name));
            }

        }
    }

}
