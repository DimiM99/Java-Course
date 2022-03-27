import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //getting the string
        String check = scanner.next();
        // lowercase or uppercase the string since the case is irrelevant
        if (check.toUpperCase().contains("J")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}