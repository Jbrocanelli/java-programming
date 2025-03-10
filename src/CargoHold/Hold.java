package CargoHold;

import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        int currentWeight = 0;
        for(Suitcase s : suitcases){
            currentWeight += suitcase.totalWeight();
        }
        if(currentWeight + suitcase.totalWeight() <= maxWeight){
            suitcases.add(suitcase);
        }
    }

    public void printItems(){
        for (Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }


    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Hold)){
            return false;
        }

        Hold comparedHold = (Hold) compared;

        if(this.suitcases.equals(comparedHold.suitcases) && this.maxWeight == comparedHold.maxWeight){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        int suitcaseWeight = 0;
        for(Suitcase suitcase: suitcases){
            suitcaseWeight += suitcase.totalWeight();
        }
        if(suitcases.isEmpty()){
            return "0 suitcases" + " (0 kg)";
        }

        if(suitcases.size() > 1){
            return suitcases.size() + " suitcases" + " (" + suitcaseWeight + "kg)";
        }
        else {
            return suitcases.size() + " suitcase" + " (" + suitcaseWeight + "kg)";
        }
    }

}
