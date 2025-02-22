import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtils {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

public class IsEvenSingleTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testEvenNumbers(int number) {
        assertTrue(NumberUtils.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testOddNumbers(int number) {
        assertFalse(NumberUtils.isEven(number), number + " should be odd");
    }
}

