import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        // write your code here
        Supplier<Integer> sup = new Supplier<Integer>() {
            int a = 0;
            @Override
            public Integer get() {
                return a++;
            }
        };
        return sup;
    }

}