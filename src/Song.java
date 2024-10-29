public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared){

        if(this == compared){
            return true;
        }

        if(!(compared instanceof Song)){
            return false;
        }

        Song songCompared = (Song) compared;

        if(this.artist == songCompared.artist && this.name == songCompared.name && this.durationInSeconds == songCompared.durationInSeconds){
            return true;
        }
        return false;

    }
}
