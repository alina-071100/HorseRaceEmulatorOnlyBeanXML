package am.example.horseEmulatorXml.beans;

public class Horse {
    private String breed;
    private int raceNumber;
    private String rider;


    public Horse(String breed, int raceNumber, String rider){
        this.breed = breed;
        this.raceNumber = raceNumber;
        this.rider = rider;
    }
    public Horse() {
    }
    public String getBreed() { return breed; }

    public void setBreed(String breed) {this.breed = breed;}

    public int getRaceNumber() { return raceNumber;}

    public void setRaceNumber(int raceNumber) {this.raceNumber = raceNumber;}

    public String getRider() {return rider;}

    public void setRider(String rider) {this.rider = rider;}

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", raceNumber=" + raceNumber +
                ", rider='" + rider + '\n' +
                '}';
    }
}
