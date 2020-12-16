package practiceOne;

import java.util.Scanner;

public class TaskFive {
    public static void solutionFive() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год ");
        int year = in.nextInt();
        for (int yearA = year + 1; ; yearA++) {
            int thousand = yearA / 1000;
            int hundred = yearA / 100 % 10;
            int ten = yearA / 10 % 10;
            int one = yearA / 10;
            if (thousand != hundred && thousand != one && hundred != ten && hundred != one && ten != one) {
                System.out.println("Минимальный номер года " + yearA);
                break;
            }
        }
    }
}
