package hw.seminar2;

import java.util.ArrayList;
import java.util.List;

import hw.seminar2.interfaces.Goable;
import hw.seminar2.interfaces.Swimable;
import hw.seminar2.Animals.Animal;
import hw.seminar2.Personal.Doctor;
import hw.seminar2.Personal.Nurce;
import hw.seminar2.Personal.Personal;
import hw.seminar2.interfaces.Flyable;

public class VetClinic {
    private String name;
    private List<Animal> animals;
    private List<Personal> personals;

    public VetClinic (String name, List<Animal> animals, List<Personal> personals) {
        this.name = name;
        this.animals = new ArrayList<>();   
        this.personals = new ArrayList<>();     
    }
    
    public void getGoable(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Goable) {
                System.out.println(animal.getClass().getSimpleName() + " is goable");
            }
        }
    }

    public void getSwimable(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                System.out.println(animal.getClass().getSimpleName() + " is swimable");
            }
        }
    }

    public void getFlyable(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.getClass().getSimpleName() + " is flyable");
            }
        }
    }

    public void getDoctor(List<Personal> personals) {
        for (Personal person : personals) {
            if (person instanceof Doctor) {
                ((Doctor) person).doDiagnoze();
            }
        }
    }

    public void getPersonal(List<Personal> personals) {
        for (Personal person : personals) {
            if (person instanceof Doctor) {
                ((Doctor) person).doDiagnoze();
            } else {
                ((Nurce) person).doVaccine();
            }
        }
    }
}