package am.example.horseEmulatorXml.spring;

import am.example.horseEmulatorXml.beans.Horse;
import am.example.horseEmulatorXml.service.EmulationService;

import am.example.horseEmulatorXml.service.EmulationServiceImpl;
import am.example.horseEmulatorXml.service.HorseServiceImpl;
import am.example.horseEmulatorXml.service.RaceService;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HorseServiceImpl horseService = context.getBean("horseService", HorseServiceImpl.class);
        System.out.print("All Horses    \n" + horseService);
        RaceService raceService = context.getBean("raceService", RaceService.class);
        System.out.println("All Horses Members and Race Parameters  \n" + raceService.getRace());
        EmulationService emulationService = new EmulationServiceImpl();
        List<Horse> horse = emulationService.getHorse(horseService.getHorse());
        System.out.println("WINNER Horse  \n" + horse);
    }
}
