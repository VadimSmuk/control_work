import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        String[] originalArray = new String[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.next();
        }

