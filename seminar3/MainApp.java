// Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo() подсказка: можно добавить, а можно не добавлять в класс поля;
// Создать несколько экземпляров Pharmacy, добавить их в ArrayList, написать метод, выводящий Pharmacy в отсортированном виде.
// *(усложненное, не обязательное) Постараться написать еще 1 метод сортировки лекарств, но уже по другому параметру

package seminar3.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import seminar3.hw.Components.Penicillin;
import seminar3.hw.Components.Salt;
import seminar3.hw.Components.Water;

public class MainApp {
    public static void main(String[] args) {
        PharmacyIterable medicine1 = new PharmacyIterable();
        medicine1.addComponent((new Penicillin("Penicillin", 2.0, 15)))
                .addComponent(new Salt("Salt", 10.0, 50))
                .addComponent(new Water("Water", 5.0, 100));

        PharmacyIterable medicine2 = new PharmacyIterable();
        medicine2.addComponent((new Penicillin("Penicillin", 1.5, 9)))
                .addComponent(new Salt("Salt", 10.0, 45))
                .addComponent(new Water("Water", 8.5, 70));

        PharmacyIterable medicine3 = new PharmacyIterable();
        medicine3.addComponent((new Penicillin("Penicillin", 3.5, 70)))
                .addComponent(new Salt("Salt", 11.0, 50))
                .addComponent(new Water("Water", 6.0, 170));

        List<PharmacyIterable> medicineList = new ArrayList<PharmacyIterable>(Arrays.asList(medicine1, medicine2, medicine3));
        System.out.println(medicineList);
        System.out.println("-------------------------------------");
        Collections.sort(medicineList);
        System.out.println(medicineList);
        System.out.println("-------------------------------------");
        for (PharmacyIterable totalPower : medicineList) {
            System.out.println(totalPower.getTotalPower());
        }
    }
}
