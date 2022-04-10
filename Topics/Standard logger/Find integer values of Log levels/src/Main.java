
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] levels = line.split(" ");
        int result = 0;
        for (String level : levels) {
            result = result + levelValueCalculation(level);
        }
        System.out.println(result);
    }
    private static int levelValueCalculation(String logLevel) {
        return Level.parse(logLevel.toUpperCase(Locale.ROOT)).intValue();
    }
}