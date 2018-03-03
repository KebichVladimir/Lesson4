package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество новостей: ");
        int news = scan.nextInt();
        int numberOfPages = pages(news);
        System.out.println("Количество страниц: " + numberOfPages);
    }

    public static int pages(int news) {
        if (news % 10 == 0) {
            return (news / 10);
        } else
            return (news / 10 + 1);
    }
}