import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        String longestword ="";
        int longest = 0;
        for (String value : list) {
            if (value.length() > longest) {
                longest = value.length();
                longestword = value;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, longestword);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}