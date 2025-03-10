package PrintingACollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof SimpleCollection)){
            return false;
        }

        SimpleCollection comparedCollection = (SimpleCollection) compared;
        if(this.name == comparedCollection.name && this.elements == comparedCollection.elements){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String printCollection = "the collection characters has " + this.elements.size();

        if (this.elements.isEmpty()){
            return "This collection characters is empty";
        }

        String onCollection = "";
        for (String element : elements){
            onCollection += element + "\n";
        }
        if(this.elements.size() == 1){
            return  printCollection  + " element:" + "\n" +  onCollection;
        }
        else{
            return printCollection  + " elements:" + "\n" +  onCollection;
        }

    }
}
