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
    }

    @Test
    void writeFile() {
    }

    @Test
    void getFileName() {
    }
}