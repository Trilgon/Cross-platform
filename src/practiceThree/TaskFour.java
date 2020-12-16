package practiceThree;

import static practiceThree.MainThree.*;

public class TaskFour {
    public static void solutionFour() {
        int j = 0;
        int found;

        System.out.println("Вывод для задачи 4:");
        builder.append("Вывод для задачи 4:");

        System.out.println("Какие символы вы хотите заменить? (Примечание: будут заменены первые вхождения этих символов, если нужно удалить больше - вводите больше)");
        symbols.append(in.nextLine());

        System.out.println("На какие символы вы хотите их заменить?");
        replace.append(in.nextLine());

        while (symbols.length() != 0) {
            found = builder.indexOf(symbols.substring(0, 1));
            builder.replace(found, found + 1, replace.substring(j, j + 1));
            symbols.delete(0, 1);

            if (replace.length() > 1) {
                if (j < replace.length()) {
                    j++;
                } else {
                    j = 0;
                }
            }
        }

        System.out.println("Изменённая строка: " + builder);
    }
}
