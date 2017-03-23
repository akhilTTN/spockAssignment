
import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer.

public class Q8 {
    String reverseString(String s) {
        StringBuffer string = new StringBuffer(s);
        string.reverse();
        return string.toString();
    }

    String replaceString(String s) {
        StringBuffer string = new StringBuffer(s);
        string.replace(4, 9, "");
        return string.toString();
    }

    public static void main(String[] args) {
        Q8 q = new Q8();
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        System.out.println("before reverse \n" + string);
        string = q.reverseString(string);
        System.out.println("after reverse " + string);
        string = q.replaceString(string);
        System.out.println("after removing index 4- 9 " + string);
    }
}
