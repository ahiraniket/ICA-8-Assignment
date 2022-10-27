import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {
        String input = new String();
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Input:");
        input = in.nextLine();
        System.out.println(goodString(input));
    }

    public static Boolean goodString(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
                return false;
            }
        }
        return true;
    }
}
