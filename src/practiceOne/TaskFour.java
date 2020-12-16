package practiceOne;

import java.util.Scanner;

public class TaskFour {
    public static void solutionFour() {
        Scanner in = new Scanner((System.in));
        System.out.println(Factorial(in.nextInt()));
    }

    private static int Factorial(int fс) {
        if (fс <= 1) {
            return 1;
        } else {
            return fс * Factorial(fс - 1);
        }
    }
}
