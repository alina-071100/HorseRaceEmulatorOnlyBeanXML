package am.example.horseEmulatorXml.service;


import am.example.horseEmulatorXml.beans.Race;

import java.time.LocalDate;

public class RaceServiceImpl implements RaceService {
    private HorseService horseService;

    public RaceServiceImpl(HorseService horseService) {
        this.horseService = horseService;
    }

    public RaceServiceImpl() {
    }

    @Override
    public Race getRace() {
        Race race = new Race();
        race.setHorseList(horseService.getHorse());
        race.setLength(10);
        race.setDate(LocalDate.now());
        return race;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }

    @Override
    public String toString() {
        return "RaceServiceImpl{" +
                "horseService=" + horseService +
                '}';
    }
}