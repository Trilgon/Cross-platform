package practiceThree;

import java.util.ArrayList;

import static practiceThree.MainThree.*;

public class TaskSeven {
    public static void solutionSeven() {
        ArrayList<Double> numbers = new ArrayList<Double>();
        try {
            while (true)
            numbers.add(Double.parseDouble(in.next()));
        } catch (NumberFormatException e) {
            for (var item : numbers){
                System.out.print(item + " ");
            }
        }
    }
}
