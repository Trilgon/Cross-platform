package practiceThree;

import static practiceThree.MainThree.*;

public class TaskTwo {
    public static void solutionTwo() {
        String answer = "";
        System.out.println("Вывод для задачи 2:");
        answer = answer.concat("Меня зовут ").concat(name).concat(", мне ").concat(age.toString()).concat(" лет");
        System.out.println(answer);
    }
}
