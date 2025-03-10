package SantasWorkshop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    int package_weight;

    public Package(){
        this.gifts = new ArrayList<>();
        this.package_weight = 0;
    }

    public void addGift(Gift gift){
        gifts.add(gift);
        package_weight += gift.getWeight();
    }

    public int totalWeight(){
        return this.package_weight;
    }


    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Gift)){
            return false;
        }

        Package comparedPackage = (Package) compared;

        if(this.gifts.equals(comparedPackage.gifts)){
            return true;
        }
        return false;
    }
}
