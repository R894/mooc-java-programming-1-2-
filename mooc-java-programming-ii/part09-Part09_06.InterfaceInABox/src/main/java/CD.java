
public class CD implements Packable {
    String artist;
    String name;
    int pubYear;
    public CD(String artist,String name, int pubYear ){
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
    }
    @Override
    public double weight() {
        return 0.1;
    }
    
    public String toString(){
        return artist+": "+name+" ("+pubYear+")";
        
    }
}
