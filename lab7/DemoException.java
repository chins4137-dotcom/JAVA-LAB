import java.util.Scanner;

class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

class Father {
    int fAge;

    Father(int fAge) {
        this.fAge = fAge;
    }

    void check_Age() throws WrongAge {
        if (fAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        System.out.println("Father's Age: " + fAge);
    }
}

class Son extends Father {
    int sAge;

    Son(int sAge, int fAge) {
        super(fAge);
        this.sAge = sAge;
    }

    void check_Age() throws WrongAge {
        if (sAge < 0) {
            throw new WrongAge("Age cannot be negative");
        } else if (sAge >= fAge) {
            throw new WrongAge("Son's age cannot be greater than Father's age");
        }
        System.out.println("Son's Age: " + sAge);
    }

}

public class DemoException {
    public static void main(String[] args) {
        int fAge;
        int sAge;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Father's Age: ");
        fAge = s.nextInt();
        Father f = new Father(fAge);
        System.out.print("Enter Son's Age: ");
        sAge = s.nextInt();
        Son son = new Son(sAge, fAge);
        try {
            f.check_Age();
            son.check_Age();
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}
