package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.input();
        Patient patient2 = new Patient();
        patient2.input();
        Patient patient3 = new Patient();
        patient3.input();
        patient1.print();
        patient2.print();
        patient3.print();
        System.out.println("\nНайти пользователя по: ");
        System.out.println("1 - фамилии ");
        System.out.println("2 - возрасту ");
        Scanner scan = new Scanner(System.in);
        int searchBy = scan.nextInt();
        if (searchBy == 1) {
            ListPatient listPatient = new ListPatient(patient1, patient2, patient3);
            listPatient.searchSecondName();
        }
        if (searchBy == 2) {
            ListPatient listPatient = new ListPatient(patient1, patient2, patient3);
            listPatient.searchAge();
        }
    }
}

