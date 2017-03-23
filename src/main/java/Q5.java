
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

// Find common elements between two arrays.


public class Q5 {
    private Scanner sc = new Scanner(System.in);

    private void fillArray(int[] a) {
        System.out.println("Enter the values in the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    private int getsize() {
        System.out.println("Enter size of the array");
        return sc.nextInt();
    }

    List<Integer> getCommon(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    list.add(a[i]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a, b;
        Q5 ob = new Q5();
        a = new int[ob.getsize()];
        b = new int[ob.getsize()];
        ob.fillArray(a);
        ob.fillArray(b);
        System.out.println("Duplicate elements are");
        ob.getCommon(a, b);

    }
}
