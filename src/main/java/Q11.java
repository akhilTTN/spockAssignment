
/**
 * Created by akhil on 16/3/17.
 */
//Write a single program for following operation using overloading A) Adding 2 integer number B) Adding 2 double C) Multipling 2 float d) Multipling 2 int E) concate 2 string F) Concate 3 String

public class Q11 {
    int operations(int a, int b) {
        return a + b;
    }

    double operations(double a, double b) {
        return a + b;
    }

    float operations(float a, float b) {
        return a * b;
    }

    String operations(String a, String b) {
        return a + b;
    }

    int operations(int a) {
        return a * 10;
    }

    String operations(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Q11 ob = new Q11();
        System.out.println(ob.operations(10, 20));
        System.out.println(ob.operations(10.50, 20.20));
        System.out.println(ob.operations("akhil ", "Singh"));
        System.out.println(ob.operations(10));
        System.out.println(ob.operations("Akhil ", "Singh ", "Rawat"));
    }
}
