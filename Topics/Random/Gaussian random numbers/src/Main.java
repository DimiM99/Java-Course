import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long k = scanner.nextLong();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        Random random = new Random(k);
        int count = 0;

        while (true) {
            for (int i = 0; i < n; i++) {
                double randomNumber = random.nextGaussian();
                if (randomNumber > m) {
                    random.setSeed(++k);
                    count = 0;
                    break;
                }
                count++;
            }
            if (count == n) {
                break;
            }
        }
        System.out.println(k);
    }
}