import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    String author = "----- Aniket Ahir ----- ";
    String input_fname = "src/urinal.dat";

    @Test
    void goodString() {
        assertAll(
                () -> assertEquals(false, urinals.goodString("1110")),
                () -> assertEquals(true, urinals.goodString("10101"))
        );
    }

    @Test
    void openFile() {
        File file = new File(input_fname);
        assertTrue(file.exists());
        System.out.println(author + " OpenFile --> File Exists => TEST EXECUTED -----");

        assertTrue(file.length() != 0);
        System.out.println(author + " OpenFile --> File Empty => TEST EXECUTED -----");


    }

    @Test
    void countUrinals() {
        assertAll(
                () -> assertEquals(1, urinals.countUrinals("10001")),
                () -> assertEquals(0, urinals.countUrinals("1001")),
                () -> assertEquals(3, urinals.countUrinals("00000")),
                () -> assertEquals(2, urinals.countUrinals("0000")),
                () -> assertEquals(1, urinals.countUrinals("01000")),
                () -> assertEquals(-1, urinals.countUrinals("011"))
        );
    }

    @Test
    void writeFile() {

    }

    @Test
    void getFileName() {
        String g_fname = urinals.getFileName();

    }
}