import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char c = '1' + '3';
        System.out.println(c);
        long lo = Integer.MAX_VALUE; // (1)
        int i = lo; // (2)
        char ch = i; // (3)
        double d = ch; // (4)
        float f = d; // (5)
    }
}