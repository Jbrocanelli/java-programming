package SantasWorkshop;

public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Gift)){
            return false;
        }

        Gift comparedGift = (Gift) compared;
        if(this.name.equals(comparedGift.name) && this.weight == comparedGift.weight){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return this.name + "(" + this.weight + " kg)";
    }

}
