package InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packables{
    private double maxCapacity;
    private ArrayList<Packables> packables;

    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packables packable){
        if(this.weight() + packable.weight() <= maxCapacity){
            packables.add(packable);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for(Packables packable: packables){
            totalWeight += packable.weight();
        }
        return totalWeight;
    }

    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight: " + this.weight();
    }
}
