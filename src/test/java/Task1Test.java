import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {


    @Test
    void validStringTest1() {
        boolean actual = Task1.validString("(())");
        assertTrue(actual);
    }

    @Test
    void validStringTest2() {
        boolean actual = Task1.validString("()[]{}");
        assertTrue(actual);
    }

    @Test
    void validStringTest3() {
        boolean actual = Task1.validString("([{}])");
        assertTrue(actual);
    }

    @Test
    void validEmptyString() {
        boolean actual = Task1.validString("");
        assertTrue(actual);
    }

    @Test
    void validStringTest4() {
        boolean actual = Task1.validString("((((((((((()");
        assertFalse(actual);
    }
    @Test
    void validStringTest5() {
        boolean actual = Task1.validString("({)}");
        assertFalse(actual);
    }

    @Test
    void validStringTest6() {
        boolean actual = Task1.validString(")(");
        assertFalse(actual);
    }
}