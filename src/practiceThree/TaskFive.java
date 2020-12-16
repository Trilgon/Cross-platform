package practiceThree;

import static practiceThree.MainThree.in;

public class TaskFive {
    public static void solutionFive() {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        System.out.println("Введите строку");
        builder.append(in.nextLine());

        for (int i = 0; i < builder.length(); i++) {
            if (isLowerCase(builder.substring(i, i + 1))) {
                builder.replace(i, i + 1, (builder.substring(i, i + 1)).toUpperCase());
            } else {
                builder.replace(i, i + 1, (builder.substring(i, i + 1)).toLowerCase());
            }
        }
        System.out.println("Та же строка, но с противополжным регистром: " + builder);
        System.out.println("Та же строка, но с верхним регистром: " + builder.substring(0).toUpperCase());
        System.out.println("Та же строка, но с нижним регистром: " + builder.substring(0).toLowerCase());

        builder.delete(0, builder.length());
        System.out.println("Введите первую строку для сравнения");
        builder.append(in.nextLine());
        System.out.println("Введите вторую строку для сравнения");
        builder2.append(in.nextLine());

        if (builder.toString().equals(builder2.toString())){
            System.out.println("Строки одинаковы");
        } else {
            System.out.println("Строки не одинаковы");
        }
    }

    private static boolean isLowerCase(String symbol) {
        return symbol.equals(symbol.toLowerCase());
    }
}
