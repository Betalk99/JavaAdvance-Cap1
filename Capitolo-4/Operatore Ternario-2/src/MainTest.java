import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkValue() {
        int value = 5;
        String exp = "FizzBuzz";
        String result = Main.checkValue(value);
        assertEquals(exp, result);
    }
}