import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // Ошибка - деление на ноль. Код не работиал и выкидывал исключение ArithmeticException.
    // Не совсем понял, какое решение требуется по задаче. Поменя местами числитель и знаменатель
    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : Integer.MAX_VALUE;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
