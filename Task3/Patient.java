package Task3;

import java.util.Scanner;

class Patient {
    private String firstName;
    private String secondName;
    private int age;
    private boolean men;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        firstName = scan.nextLine();
        System.out.println("Введите Фамилию: ");
        secondName = scan.nextLine();
        System.out.println("Введите возраст: ");
        age = scan.nextInt();
        System.out.println("Введите пол (1- мужской, 2- женский):");
        int attributeMen = scan.nextInt();
        if (attributeMen == 1) {
            men = true;
        }
    }

    public void print() {
        System.out.print(firstName + " " + secondName + " - Возраст = " + age + ", пол - ");
        if (men)
            System.out.println("мужской");
        else
            System.out.println("женский");

    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
}


