

/**
 * Created by akhil on 16/3/17.
 */
//Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks.

abstract class Bank {
    static String bankName;
    static String bankLocation;
    static double rateOfInterest;

    abstract void getDetail();
}

class SBI extends Bank {
    SBI() {
        bankName = "SBI";
        bankLocation = "Delhi";
        rateOfInterest = 10.25;
    }

    @Override
    void getDetail() {
        System.out.println("Name of the bank is " + bankName);
        System.out.println("Bank is located at " + bankLocation);
        System.out.println("Bank has rate of interest is " + rateOfInterest);
    }
}

class BOI extends Bank {

    BOI() {
        bankName = "BOI";
        bankLocation = "Mumbai";
        rateOfInterest = 9.25;
    }

    @Override
    void getDetail() {
        System.out.println("Name of the bank is " + bankName);
        System.out.println("Bank is located at " + bankLocation);
        System.out.println("Bank has rate of interest is " + rateOfInterest);
    }
}

class ICICI extends Bank {

    ICICI() {
        bankName = "ICICI";
        bankLocation = "Pune";
        rateOfInterest = 12.25;
    }

    @Override
    void getDetail() {
        System.out.println("Name of the bank is " + bankName);
        System.out.println("Bank is located at " + bankLocation);
        System.out.println("Bank has rate of interest is " + rateOfInterest);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.getDetail();
        b = new BOI();
        b.getDetail();
        b = new ICICI();
        b.getDetail();
    }
}
