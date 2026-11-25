
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String input = sc.nextLine().toUpperCase();

        String digits = "";

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c))
                digits += c;
            else if ("ABC".contains(c + ""))
                digits += "2";
            else if ("DEF".contains(c + ""))
                digits += "3";
            else if ("GHI".contains(c + ""))
                digits += "4";
            else if ("JKL".contains(c + ""))
                digits += "5";
            else if ("MNO".contains(c + ""))
                digits += "6";
            else if ("PQRS".contains(c + ""))
                digits += "7";
            else if ("TUV".contains(c + ""))
                digits += "8";
            else if ("WXYZ".contains(c + ""))
                digits += "9";
        }

        if (digits.length() == 10)
            System.out.println("Converted: (" + digits.substring(0, 3)
                + ") " + digits.substring(3, 6) + "-"
                + digits.substring(6));
        else
            System.out.println("Invalid phone number!");

        sc.close();
    }
}
