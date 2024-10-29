public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Pet(String name) {
        this(name, "Pit bull");
    }

    public Pet() {
        this("Don", "Pit bull");
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + breed + ")";
    }
}
