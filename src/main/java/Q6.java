

import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//There is an array with every element repeated twice except one. Find that element?

public class Q6 {
    private void msort(String[] array, int start, int end) {
        if (start < end) {
            int half = (start + end) / 2;
            msort(array, start, half);
            msort(array, half + 1, end);
            merge(array, start, half, end);
        }
    }

    private void merge(String[] array, int start, int half, int end) {
        int s1, s2;
        s1 = half + 1 - start;
        s2 = end - half;

        String[] left_array = new String[s1];
        String[] right_array = new String[s2];

        for (int i = 0; i < s1; i++)
            left_array[i] = array[start + i];
        for (int i = 0; i < s2; i++)
            right_array[i] = array[half + 1 + i];

        int i = 0, j = 0, k = start;

        while (i < s1 && j < s2) {
            if (left_array[i].compareTo(right_array[j]) < 0) {
                array[k] = left_array[i];
                i++;
            } else {
                array[k] = right_array[j];
                j++;
            }
            k++;
        }
        while (i < s1) {
            array[k] = left_array[i];
            i++;
            k++;
        }
        while (j < s2) {
            array[k] = right_array[j];
            j++;
            k++;
        }
    }

    private void print_array(String[] array) {
        for (String s : array)
            System.out.println(s);
        System.out.println("......................................................................");
    }

    String findSingleChar(String[] array) {
        String uni = "";
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                if (!array[i].equals(array[i - 1])) {
                    System.out.println(array.length);
                    System.out.println("Single element in the array is " + array[i - 1]);
                    uni = array[i - 1];
                    return uni;
                }
            }
        }
        if (!(array[array.length - 1].equals(array[array.length - 2]))) {
            System.out.println("Single element in the array is " + array[array.length - 1]);
            uni = array[array.length - 1];
        }
        return uni;
    }

    public static void main(String[] args) {
        Q6 ob = new Q6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.next();
        String[] array = a.split("");
        ob.msort(array, 0, array.length - 1);
//        ob.print_array(array);
        ob.findSingleChar(array);
    }
}
