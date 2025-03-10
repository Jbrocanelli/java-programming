package BigYear;

import java.util.ArrayList;
import java.util.Collections;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    private int birdCount;

    public BirdDatabase(){
        this.birds = new ArrayList<>();
        this.birdCount = 0;
    }

    // Getters
    public ArrayList<Bird> getBirds() {
        return this.birds;
    }

    public int getBirdCount() {
        return this.birdCount;
    }

    // Adds a bird
    public void addBird(Bird bird){
        if(!(birds.contains(bird))){
            birds.add(bird);
        }
    }

    // Prints all birds
    public void printBirds(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }

    // Prints a bird
    public void printABird(String birdName){
        Bird bird = findBirdByName(birdName);
        if(birds.contains(bird)){
            System.out.println(bird);
        }
        else{
            System.out.println("Not a bird!");
        }

    }

    // Gets bird by name
    public Bird findBirdByName(String birdName){
        for(Bird bird : birds){
            if(bird.getBird().equalsIgnoreCase(birdName)){
                return bird;
            }
        }
        return null;
    }

    // Adds an observation to a bird
    public void addBirdObservation(String birdName){
        Bird bird = findBirdByName(birdName);
        if(bird != null){
            bird.addObservation();
        }
        else{
            System.out.println("Not a bird!");
        }
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof BirdDatabase)){
            return false;
        }
        BirdDatabase comparedDatabase = (BirdDatabase) compared;
        if(this.birds.equals(comparedDatabase.birds) && this.birdCount == comparedDatabase.birdCount){
            return true;
        }
        return false;
    }


}
