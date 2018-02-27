package Task1;

public class Main {
    public static void main(String[] args) {
        Method ourMethod = new Method();
        int[] arr = ourMethod.input();
        System.out.println("Массив:");
        ourMethod.print(arr);
        ourMethod.sorting(arr);
        System.out.println("\nОтсортированный массив по возрастанию:");
        ourMethod.print(arr);
    }
}