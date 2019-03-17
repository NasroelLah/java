class Album{
    String name;
    String artist;
    int year;
    public Album(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public int getYear(){
        return year;
    }
}

class Song extends Album{
    String title;
    String genre;
    public Song(String name, String artist, int year, String title, String genre){
        super(name, artist, year);
        this.title = title;
        this.genre = genre;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
}

public class Music{
    public static void main(String[] args) {
        Song single = new Song("X", "Ed Sheeran", 2014, "Photograph", "Pop");
        System.out.println("Judul Lagu: "+single.getTitle() + "\nNama Penyanyi: "+single.getArtist());
        System.out.println("Nama Album: "+single.getName() + "\nTahun Rilis: "+single.getYear());
        System.err.println("Genre: "+single.getGenre());
    }
}