package practiceThree;

import static practiceThree.MainThree.in;

public class TaskSix {
    public static void solutionSix() {
        StringBuilder builder = new StringBuilder();

        System.out.println("Введите строку");
        builder.append(in.nextLine());
        System.out.println("Та же строка, но в обратном порядке: " + builder.reverse());
    }
}
