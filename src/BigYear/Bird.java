package BigYear;

public class Bird {
    private String bird;
    private String nameInLatin;
    private int observations;

    public Bird(String bird, String nameInLatin){
        this.bird = bird;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }

    // Getters
    public String getBird() {
        return this.bird;
    }

    public String getNameInLatin() {
        return this.nameInLatin;
    }

    public int getObservations() {
        return observations;
    }

    public void addObservation(){
        this.observations += 1;
    }

    @Override
    public String toString(){
        return bird + "(" + nameInLatin + "): " + observations + " observations";
    }
}
