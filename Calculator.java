package Task1_1_CalculatorLambda;
import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    Consumer<Integer> println = System.out::println;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    //BinaryOperator<Integer> plus = Integer::sum;

    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> divide = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("На ноль делить нельзя");
            return y;
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

}
