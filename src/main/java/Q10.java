
/**
 * Created by akhil on 16/3/17.
 */

//Write a program to display values of enums using a constructor & getPrice() method(Example display house & thier prices ).

public class Q10 {
    public enum Houses {
        KACHHA(10),
        PAKKA(50),
        FLAT(100),
        BUNGLOW(500),
        PENTHOUSE(1000);

        private final int price;

        Houses(int price) {
            this.price = price;
        }

        int getPrice() {
            return price;

        }


        public static void main(String[] args) {
            for (Houses hh : Houses.values()) {
                System.out.println(hh + " has a price of " + hh.getPrice() + " Lakhs");
            }
        }
    }
}
