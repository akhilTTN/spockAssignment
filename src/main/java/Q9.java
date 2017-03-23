

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//Write a program to read text file & print the content of file using String Builder.

public class Q9 {
    public static void main(String[] args) {
        File f = new File("//home//akhil//Desktop//temp.txt");
        StringBuilder sb = new StringBuilder("");
        try {
            Scanner sc = new Scanner(f);
            if (sc.hasNext())
                sb.append(sc.nextLine());
        } catch (FileNotFoundException ef) {
            ef.printStackTrace();
        }
        System.out.println("contents of the file are");
        System.out.println(sb);
    }
}
