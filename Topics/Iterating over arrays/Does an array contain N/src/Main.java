import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = read.nextInt();
        }
        int n = read.nextInt();
        read.close();
        boolean status = false;
        for (int element: numbers) {
            if (element == n) {
                status = true;
                break;
            }
        }
        System.out.println(status);
    }
}