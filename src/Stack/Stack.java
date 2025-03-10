package Stack;

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> items;

    public Stack(){
        this.items = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(!(items.isEmpty())){
            return false;
        }
        else{
            return true;
        }
    }

    public void add(String value){
        if(!(items.contains(value))){
            items.add(value);
        }
    }

    public ArrayList<String> values(){
        return this.items;

    }

    public String take() {
        return this.items.remove(items.size()-1);
    }


    @Override
    public boolean equals(Object compared) {
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Stack)){
            return false;
        }

        Stack comparedStack = (Stack) compared;

        if(this.items.equals(comparedStack.items)){
            return true;
        }
        return false;
    }
}


