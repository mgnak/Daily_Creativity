import org.example.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    @Test
    void testReverseNumbers() {
        ReverseString reversedString = new ReverseString();
        String res = reversedString.ReverseString1("123");
        assertEquals("123 should equal 321", res, "321");
    }
}
