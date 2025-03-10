package LiquidContainers2;

public class Container {
    private int liquidAmount;
    private int maxAmount;

    public Container(){
        this.liquidAmount = 0;
        this.maxAmount = 100;
    }

    public int contains(){
        return liquidAmount;
    }

    public void add(int amount){
        if(amount > 0 && (liquidAmount + amount <= maxAmount)){
            liquidAmount += amount;
        } else if (liquidAmount + amount > maxAmount) {
            liquidAmount = maxAmount;
        }
    }

    public void remove(int amount){
        if(amount > 0 && (liquidAmount - amount >= 0)){
            liquidAmount -= amount;
        } else if (liquidAmount - amount < 0) {
            liquidAmount = 0;
        }
    }

    public String toString(){
        return liquidAmount + "/" + maxAmount;
    }

}
