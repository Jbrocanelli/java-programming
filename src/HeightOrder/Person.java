package HeightOrder;

public class Person {
    private String name;
    private int height;

    public Person(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return this.name + " (" + this.height + " cm)";
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Person)){
            return false;
        }

        Person comparedPerson = (Person) compared;

        if(this.name.equals(comparedPerson.name) && this.height == comparedPerson.height){
            return true;
        }
        return false;
    }
}

