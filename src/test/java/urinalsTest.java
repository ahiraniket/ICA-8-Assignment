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
        System.out.println(author + "GoodString --> Test Cases => TEST EXECUTED -----");
    }

    @Test
    void openFile() {
        File file = new File(input_fname);
        assertTrue(file.exists());
        System.out.println(author + "Read File Tests --> File Exists => TEST EXECUTED -----");

        assertTrue(file.length() != 0);
        System.out.println(author + "Read File Tests --> File Empty => TEST EXECUTED -----");




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
        System.out.println(author + "CountUrinals Test --> Test Cases => TEST EXECUTED -----");
    }

    @Test
    void writeFile() {

    }

    @Test
    void getFileName() {
        String g_fname = urinals.getFileName();
        String name_init = g_fname.substring(4, 8);
        String name_last = g_fname.substring(g_fname.lastIndexOf('.'), g_fname.length());
        String name_digit = g_fname.substring(8, g_fname.lastIndexOf('.'));
        int n = Integer.parseInt(name_digit);

        assertAll(
                () -> assertEquals("rule",name_init),
                () -> assertEquals(".txt",name_last)
        );
        System.out.println(author + "Write File Tests --> Bad File Name => TEST EXECUTED -----");
    }
}