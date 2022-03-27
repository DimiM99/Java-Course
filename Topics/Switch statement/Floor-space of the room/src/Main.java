import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14; // pi number replacement
        String type = scanner.nextLine();
        switch (type) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(result);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(pi * r * r);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}