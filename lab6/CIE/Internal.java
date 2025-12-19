package CIE;

import java.util.Scanner;

public class Internal {
    Scanner s = new Scanner(System.in);
    public int[] cie_marks = new int[5];

    public void internal_marks() {
        System.out.println("Enter Internal marks");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks" + (i + 1) + ": ");
            cie_marks[i] = s.nextInt();
        }
    }

}
