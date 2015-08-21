
public class Swimmer {

    private int raceID;
    private String name;
    
    //Default constructure
    public Swimmer() {
        //do nothing.
    }
    
    //Explicit constructure
    public Swimmer(int racerID, String swimmerName) {
        raceID = racerID;
        name = swimmerName;
    }
    
    public int getRaceID() {
        return raceID;
    }
    
    public void setRaceID(int value) {
        raceID = value;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String value) {
        name = value;
    }
    
    public String performSport() {
        return "Swimming";
    }
    
    public String toString() {
        return String.format("%s:\t%d is %s\n"
                , getName()
                , getRaceID()
                , performSport());
    }
}
