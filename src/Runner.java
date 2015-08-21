
public class Runner {

    private int raceID;
    private String name;
    
    public Runner() {
        //do nothing.
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
        return "Running";
    }
    
    public String toString() {
        return String.format("%s:\t%d is %s\n"
                , getName()
                , getRaceID()
                , performSport());
    }
}
