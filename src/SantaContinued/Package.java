package SantaContinued;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    private int totalWeight;

    public Package(){
        this.gifts = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void addGift(Gift gift){
        this.totalWeight += gift.getWeight();
        this.gifts.add(gift);
    }

    public int totalWeight(){
        return this.totalWeight;
    }
}
