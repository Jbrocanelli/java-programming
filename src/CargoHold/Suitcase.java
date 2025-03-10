package CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        int currentWeight = 0;
        for (Item i : items) {
            currentWeight += i.getWeight();
        }

        if (currentWeight + item.getWeight() <= maxWeight && !items.contains(item)) {
            items.add(item);
        }
    }

    public void printItems(){
        for(Item item : items){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        // if list is empty return null
        if(items.isEmpty()){
            return null;
        }

        // initialize object reference variable
        Item heaviest = items.get(0);

        // if item is heavier update reference variable
        for (Item item : items){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString(){
        int resultWeight = 0;
        for(Item item : items){
           resultWeight+= item.getWeight();
        }

        if (this.items.isEmpty()){
            return "0 items (" + resultWeight + "kg)";
        }
        if (this.items.size() > 1) {
            return items.size() + " items" + " (" + resultWeight + " kg)";
        } else {
            return items.size() + " item" + " (" + resultWeight + " kg)";
        }
    }
}
