package Herds;

import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable member: herd){
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String members = "";
        for(Movable movable: herd){
            members += movable.toString() + "\n";
        }
        return members;
    }
}
