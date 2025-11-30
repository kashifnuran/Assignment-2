import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassTests {

    @org.junit.Test
    @Test
    public void testInitialValues() {
        ClassB counter = new ClassB();
        assertEquals(0, counter.getLineCount(), "Line count should start at 0");
        assertEquals(0, counter.getCharacterCount(), "Character count should start at 0");
    }

    @Test
    public void testAddLine() {
        ClassB counter = new ClassB();
        counter.addLine("hello");
        assertEquals(1, counter.getLineCount(), "Should count one line");
        assertEquals(5, counter.getCharacterCount(), "Should count 5 characters");
    }

    @Test
    public void testIsStop() {
        ClassB counter = new ClassB();
        assertTrue(counter.isStop("stop"), "Should detect stop command");
        assertTrue(counter.isStop("STOP"), "Should detect stop regardless of case");
        assertFalse(counter.isStop("hello"), "Should not detect stop for normal text");
    }
}
