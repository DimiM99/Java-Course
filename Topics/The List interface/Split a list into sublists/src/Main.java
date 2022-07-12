import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class ListUtils {

    /**
     * It splits the passed list into a sequence of sublists with a predefined size 
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();
        // write your code here
        int rem = list.size() % subListSize;
        int maxSize = list.size();
        int start = 0;
        int end = subListSize;

        if (subListSize > maxSize) {
            sublists.add(list);
            return sublists;
        }

        do {
            List<T> newList = new ArrayList<>();
            for (int i = start; i < end; i++) {
                newList.add(list.get(i));
            }
            sublists.add(newList);
            start += subListSize;
            end += subListSize;
        } while (end <= maxSize);

        if (rem != 0) {
            List<T> last = new ArrayList<>();
            for (int i = start; i < maxSize; i++) {
                last.add(list.get(i));
            }
            sublists.add(last);
        }

        return sublists;
    }
}

/* Please, do not modify code in this class */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = ListUtils.splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {
            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
            System.out.println(representation);
        });
    }
}