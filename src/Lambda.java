import java.util.Comparator;
import java.util.function.*;

public class Lambda {
    public record Name(String name) {}

    public record Fare(int tariff, String fareBasisCode, double amount) {}

    public static final IntPredicate IS_DIVISIBLE_BY_7 = i -> i % 7 == 0;

    public static final UnaryOperator<String> TO_UPPER_CASE = String::toUpperCase;

    public static final Function<String, Name> TO_NAME = Name::new;


    public static final Comparator<Fare> FARE_COMPARATOR =
            Comparator.comparingInt(Fare::tariff)
                    .thenComparing(Fare::fareBasisCode)
                    .thenComparingDouble(Fare::amount);

    public static final BinaryOperator<String> CONCAT = (str1, str2) -> str1 + " " + str2;

    public static final IntUnaryOperator TIMES_TEN = i -> i * 10;


}
