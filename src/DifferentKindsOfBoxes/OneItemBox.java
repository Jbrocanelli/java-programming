package DifferentKindsOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public OneItemBox(){
        this.capacity = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(capacity == 0){
            items.add(item);
            capacity += 1;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(items.contains(item)){
            return true;
        }
        return false;
    }
}
