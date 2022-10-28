import java.io.*;
import java.util.Scanner;

public class urinals {
    static String input_fname = "urinal.dat";
    public static void main(String[] args) {
        String input = "1";
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.print("\n[1] Keyboard Input.\n[2] Read File.\n\n\t(3) Exit\n\nEnter Your Choice [1 - 3]:");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                while (!input.equalsIgnoreCase("-1")) {

                    System.out.print("\nEnter Input (-1 to Exit):");
                    input = in.next();
                    System.out.print(countUrinals(input));
                }
                break;

            case 2:
                openFile(input_fname);
                break;

            case 3:
                break;

            default:
                System.out.println("Invalid input!");
        }
        System.out.println("Exiting Program!!!");
    }


    public static Boolean goodString(String urinal) {

        for (int i = 0; i < urinal.length() - 1; i++) {
            if (urinal.charAt(i) == '1' && urinal.charAt(i + 1) == '1') {
                return false;
            }
        }
        return true;
    }

    public static void openFile(String fileName) {
        FileReader fr;
        try {
            fr = new FileReader("src/" + fileName);

            BufferedReader br = new BufferedReader(fr);
            String str;
            String fname = getFileName();
            while ((str = br.readLine()) != null) {
                int ur_count = countUrinals(str);
                writeFile(ur_count, fname);
            }
        } catch (IOException e) {
            System.out.println("openFile I/O Exception" + e);
        }

    }

    public static int countUrinals(String urinal) {
        int count = 0;

        if (!goodString(urinal))
            return -1;

        for (int i = 0; i < urinal.length(); i++) {
            if (urinal.charAt(i) == '0') {
                if (((i - 1 < 0) || urinal.charAt(i - 1) == '0') &&
                        ((i + 1 >= urinal.length()) || urinal.charAt(i + 1) == '0')) {
                    count++;
                    i += 1;
                }
            }
        }

        return count;
    }

    public static void writeFile(int count, String fname) {
        try {
            FileWriter fw = new FileWriter(fname, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Integer.toString(count));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("writeFile I/O Exception");
        }
    }

    public static String getFileName() {
        String fname = "src/rule.txt";
        int count = 0;
        File file = new File(fname);
        while (true) {
            if (file.exists()) {
                count++;
                fname = fname.substring(0, 8) + count + ".txt";
                file = new File(fname);
            } else {
                break;
            }
        }
        return fname;
    }

}

