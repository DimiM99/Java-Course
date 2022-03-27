import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String yearsOfExperience = scanner.next();
        String cuisinePrefence = scanner.next();
        System.out.print("The form for " + firstName + " is completed.");
        System.out.print(" We will contact you if we need a chef who cooks " + cuisinePrefence);
        System.out.print(" dishes and has " + yearsOfExperience + " years of experience.");

    }
}