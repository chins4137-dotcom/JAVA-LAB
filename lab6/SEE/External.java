package SEE;

import CIE.Personal;
import java.util.Scanner;

public class External extends Personal {
    public int[] see_marks = new int[5];
    Scanner s = new Scanner(System.in);

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void external_marks() {
        System.out.println("Enter SEE marks");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks" + (i + 1) + ": ");
            see_marks[i] = s.nextInt();
        }
    }

}
