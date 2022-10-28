import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void goodString() {
        assertAll(
                () -> assertEquals(false, urinals.goodString("1110")),
                () -> assertEquals(true, urinals.goodString("10101"))
        );
    }
}