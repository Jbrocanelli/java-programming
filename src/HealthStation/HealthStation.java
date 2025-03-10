package HealthStation;

public class HealthStation {
    private int counter;

    public HealthStation(){
        this.counter = 0;
    }

    public int weigh(Person person) {
        this.counter += 1;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return this.counter;
    }
}
