import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = Long.parseLong(scanner.next());
        String operation = scanner.next();
        long num2 = Long.parseLong(scanner.next());

        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-" :
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    System.out.println(num1 / num2);
                    break;
                }
            default:
                System.out.println("Unknown operator");
        }
    }
}