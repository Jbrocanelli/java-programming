package Archive;

public class Archive {
    private String name;
    private String id;

    public Archive(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Archive)){
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        if(comparedArchive.name.equals(((Archive) compared).name)
        && comparedArchive.id.equals(((Archive) compared).id)){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.id + ": " + this.name;
    }
}
