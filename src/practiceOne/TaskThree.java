package practiceOne;

import java.util.Scanner;

public class TaskThree {
    public static void solutionThree() {
        Scanner in = new Scanner(System.in);
        double number;

        System.out.println("Введите целое число");
        number = in.nextDouble();
        do {
            number = number / 2.0;
            if (number == 1.0) {
                System.out.println("YES YES YES");
                System.exit(0);
            }
        } while (number > 1.0);
        System.out.println("NO NO NO");
    }
}
