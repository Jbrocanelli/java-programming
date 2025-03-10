public class Human {

    String name;
    int age;
    double wight;

    Human(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.wight = weight;

    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
}
