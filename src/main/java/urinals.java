import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Input:");
        input = in.nextLine();
        System.out.println(countUrinals(input));
    }

    public static Boolean goodString(String urinal) {

        for (int i = 0; i < urinal.length() - 1; i++) {
            if (urinal.charAt(i) == '1' && urinal.charAt(i + 1) == '1') {
                return false;
            }
        }
        return true;
    }

    public static void fileOperations() {

    }

    public static int countUrinals(String urinal) {
        int count = 0;

        if (!goodString(urinal))
            return -1;

        for (int i = 0; i < urinal.length(); i++) {
            if (urinal.charAt(i) == '0'){
                if (((i - 1 < 0) || urinal.charAt(i - 1) == '0') &&
                        ((i + 1 >= urinal.length()) || urinal.charAt(i + 1) == '0')) {
                    count++;
                }
            }
        }

        return count;
    }


}

