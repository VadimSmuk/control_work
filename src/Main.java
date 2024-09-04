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

        String[] newArray = createNewArray(originalArray);

        System.out.println("Новый массив строк с длиной <= 3 символов:");
        for (String str : newArray) {
            System.out.print(str + " ");
        }
    }