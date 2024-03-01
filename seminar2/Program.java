package hw.seminar2;

import hw.seminar2.Animals.*;
import hw.seminar2.Personal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", LocalDate.of(2020, 5, 27), new Illness("deafness"));
        Cat cat1 = new Cat("Murka", LocalDate.of(2024, 1, 1), new Illness("nervious"));
        Fish fish1 = new Fish("Flaunder", LocalDate.of(2020, 12, 20), new Illness("vaccina"));
        Duck duck1 = new Duck("Donald", LocalDate.of(2021, 9, 3), new Illness("vaccina"));
        Dolphin dolphin1 = new Dolphin("Flipper", LocalDate.of(2021, 8, 31), new Illness("vaccina"));

        List<Animal> animals = new ArrayList<Animal>(Arrays.asList(dog1, cat1, fish1, duck1, dolphin1));
        System.out.println(animals);
        System.out.println("--------------");

        dog1.run(10);
        cat1.run(9);
        fish1.swim(8);
        duck1.run(2);
        duck1.fly(3);
        duck1.swim(3);
        dolphin1.swim(12);
        System.out.println("--------------");
        
        Nurce nurce1 = new Nurce("Maria Grigorievna");
        Doctor doctor1 = new Doctor("Igor' Pertovich", nurce1);
        List<Personal> personals = new ArrayList<>(Arrays.asList(nurce1, doctor1));

        VetClinic vetClinic = new VetClinic("HappyPet", animals, personals);

        vetClinic.getGoable(animals);
        System.out.println("--------------");
        vetClinic.getSwimable(animals);
        System.out.println("--------------");
        vetClinic.getFlyable(animals);
        System.out.println("--------------");
        vetClinic.getDoctor(personals);
        System.out.println("--------------");
        vetClinic.getPersonal(personals);

    }
}
