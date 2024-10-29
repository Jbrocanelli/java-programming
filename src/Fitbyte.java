public class Fitbyte {
    private int restingHeartRate;
    private int age;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;

    }


    public double targetHeartRate(double percentageOfMaximum){
        return (206.3 - (0.711 * age) - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }

}


