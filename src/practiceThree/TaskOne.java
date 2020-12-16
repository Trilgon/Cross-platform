package practiceThree;

import static practiceThree.MainThree.*;

public class TaskOne {
    public static void solutionOne() {
        String answer;
        System.out.println("Вывод для задачи 1:");
        answer = secondName.concat(" ").concat(firstName.concat(" ").concat(thirdName));
        System.out.println(answer);
    }
}
