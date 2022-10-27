import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {
        String input = new String();
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Input:");
        input = in.nextLine();
        goodString(input);
    }

    public static Boolean goodString(String str) {
        System.out.println("Input = " + str);
        System.out.println("Not yet implemented!");
        return true;
    }
}
