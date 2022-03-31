package am.example.horseEmulatorXml.service;


import am.example.horseEmulatorXml.beans.Horse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmulationServiceImpl implements EmulationService {
    Random random = new Random();
    List<Horse> list = new ArrayList<>();
    @Override
    public List<Horse> getHorse(List<Horse> horse) {
        int low = 1;
        int high = 6;
        int res = random.nextInt(high - low) + low;
        for (Horse horse1 : horse) {
            if (res == horse1.getRaceNumber()) {
                list.add(horse1);
            }
        }
        return list;
    }
}