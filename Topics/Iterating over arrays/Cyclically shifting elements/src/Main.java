import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int save = numbers[size - 1];
        int[] numbersCopy = new int[size];
        System.arraycopy(numbers, 0, numbersCopy, 1, numbers.length - 1);
        numbersCopy[0] = save;

        for (int element: numbersCopy) {
            System.out.print(element + " ");
        }

    }
}