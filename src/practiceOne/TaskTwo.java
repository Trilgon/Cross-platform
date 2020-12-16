package practiceOne;

import java.util.Scanner;

public class TaskTwo {
    public static void solutionTwo() {
        String year;
        char[] nums_of_year;
        int temp = 0;
        Scanner in = new Scanner((System.in));

        System.out.println("Введите номер года");
        year = in.nextLine();
        nums_of_year = year.toCharArray();
        if (Character.getNumericValue(nums_of_year[1]) == 0) {
            if (Character.getNumericValue(nums_of_year[3]) == 9) {
                if (Character.getNumericValue(nums_of_year[2]) == 9) {
                    nums_of_year[1] = (char) (Character.getNumericValue(nums_of_year[1]) + 1 + '0');
                    nums_of_year[2] = '0';
                    nums_of_year[3] = '1';
                }
            }
        }
        for (char num : nums_of_year) {
            System.out.print(num);
        }
    }
}
