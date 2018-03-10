package Task3;

import java.util.Scanner;

public class ListPatient {
    private Patient[] list;

    ListPatient(Patient patient1, Patient patient2, Patient patient3) {
        list = new Patient[3];
        list[0] = patient1;
        list[1] = patient2;
        list[2] = patient3;
    }

    public void searchSecondName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String secondNameSearch = scan.nextLine();
        System.out.println("Найденные пациенты");
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSecondName().equals(secondNameSearch)) {
                list[i].print();
            }
        }
    }

    public void searchAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Возраст: ");
        int ageSearch = scan.nextInt();
        System.out.println("Найденные пациенты");
        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() == ageSearch) {
                list[i].print();
            }
        }
    }
}