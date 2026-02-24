import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class TravelCalTest {

    @Test
    void testCalSpeed_Normal() {
        assertEquals(50.0, TravelCal.calSpeed(100, 2));
    }

    @Test
    void testMainMethod() {

        // Simulate user input
        System.setIn(new ByteArrayInputStream("100\n2\n".getBytes()));

        // Capture console output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        TravelCal.main(new String[]{});

        String result = output.toString();

        assertTrue(result.contains("give distance"));
        assertTrue(result.contains("give time"));
        assertTrue(result.contains("the speed: 50.0"));
    }
}