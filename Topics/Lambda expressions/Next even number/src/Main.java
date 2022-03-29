import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = (long x) -> {
        if ((x % 2) == 0) {
            x++;
        }
        while ((x % 2) == 0) {
            x++;
        }
        return x+1;
    };
}