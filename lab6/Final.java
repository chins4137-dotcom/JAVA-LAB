import CIE.Personal;
import CIE.Internal;
import SEE.External;
import java.util.Scanner;

public class Final {
    int[] final_marks = new int[5];
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Personal p = new Personal("1BF24CS321", "Mahi", 3);
        p.display();
        Internal i = new Internal();
        i.internal_marks();
        External e = new External("1BF24CS321", "Mahi", 3);
        e.external_marks();
        System.out.println("Final marks!");
        for (int j = 0; j < 5; j++) {
            System.out.println("Marks" + (j + 1) + ": " + (i.cie_marks[j] + e.see_marks[j]));
        }

    }
}