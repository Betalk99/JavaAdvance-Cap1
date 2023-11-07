import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();
    @Test
    void lunghezzaString(){
        String a = "Questa è una stringa";
        String result = testing.checkString(a);
        String exp = "Lunghezza maggiore o uguale di 10";
        assertEquals(exp, result, "Test ok");
    }
    @Test
    void lunghezzaStringNull(){
        String result = testing.checkString(null);
        String exp = "Lunghezza maggiore o uguale di 10";
        assertEquals(null, result, "Test ok");
    }

}