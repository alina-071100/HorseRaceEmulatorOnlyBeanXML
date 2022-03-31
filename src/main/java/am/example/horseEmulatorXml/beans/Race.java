package am.example.horseEmulatorXml.beans;

import java.time.LocalDate;
import java.util.List;

public class Race {
    private List<Horse> horseList;
    private long length;
    private LocalDate date ;

    public Race(List<Horse> horseList, long length, LocalDate date) {
        this.horseList = horseList;
        this.length = length;
        this.date = date;
    }

    public Race() {
    }

    public List<Horse> getHorseList() {
        return horseList;
    }

    public void setHorseList(List<Horse> horseList) {
        this.horseList = horseList;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Race{" +
                "horseList=" + horseList +
                ", length=" + length +
                ", date=" + date +
                '}';
    }
}
