package LongestInCollection;

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

    public String longest(){
        // If list is empty return null
        if (this.elements.isEmpty()){
            return null;
        }

        String returnObject = this.elements.get(0);

        for(String element: elements){
            if(returnObject.length() < element.length()){
                returnObject = element;
            }
        }

        return  returnObject;

    }

}
