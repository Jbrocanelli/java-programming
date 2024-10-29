public class Counter {
    private int startValue;
    private int value;

    public Counter(int startValue){
        this.startValue = startValue;
        this.value = this.startValue;
    }

    public Counter(){
        this.startValue = 0;
        this.value = this.startValue;
    }

    public int value(){
        return this.value;
    }

    public void increase(int increaseBy){
        value = value + increaseBy;
    }

    public void increase(){
        this.increase(1);
    }

    public void decrease(int decreaseBy){
        value = value - decreaseBy;
    }

    public void decrease(){
        this.decrease(1);
    }

    @Override
    public String toString(){
        return "value: " + value;
    }


}
