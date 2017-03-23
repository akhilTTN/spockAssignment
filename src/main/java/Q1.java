import java.util.Scanner;

/**
 * Created by akhil on 15/3/17.
 */
public class Q1 {
    String find_and_replace(String string_data, String s1, String s2) {
        if (s1 == "")
            return string_data;
        else {
            string_data = string_data.replace(s1, s2);
            return string_data;
        }
    }

    public static void main(String[] args) {
        Q1 q = new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string_data = sc.next();
        System.out.println("Enter the string to find ");
        String s1 = sc.next();
        System.out.println("Enter the string to replace ");
        String s2 = sc.next();
        System.out.println(q.find_and_replace(string_data, s1, s2));
    }
}
