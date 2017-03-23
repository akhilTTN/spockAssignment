
import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

public class Q4 {
    int countLower(String str) {
        int lower = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                lower++;
        }
        return lower;
    }

    int countUpper(String str) {
        int upper = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                upper++;
        }
        return upper;
    }

    int countDigit(String str) {
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                digits++;
        }
        return digits;
    }

    int countSpecial(String str) {
        int specialChars = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')))
                specialChars++;
        }
        return specialChars;
    }

    public static void main(String[] args) {
        Q4 q = new Q4();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lower_case = 0, upper_case = 0, special_chars = 0, digits = 0;
        System.out.println("No of digits are " + q.countDigit(s));
        System.out.println("No of UpperCase are " + q.countUpper(s));
        System.out.println("No of LowerCase are " + q.countLower(s));
        System.out.println("No of SpecialChar are " + q.countSpecial(s));
    }
}
