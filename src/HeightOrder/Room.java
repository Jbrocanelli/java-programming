package HeightOrder;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }

        Person returnObject = this.persons.get(0);

        for(Person person : persons){
            if (returnObject.getHeight() > person.getHeight()){
                returnObject = person;
            }
        }

        return returnObject;
    }

    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = shortest();
        persons.remove(shortest);

        return shortest;
    }

}
