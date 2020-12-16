package practiceThree;

import java.util.ArrayList;

public class TaskEight {
    public static void solutionEight(){
        try {
            //Код a)
            String s = null;
            String m = s.toLowerCase();
        } catch (Exception e){
            System.out.println("Исключение для кода a) " + e);
        }

        try {
            //Код b)
            int[] m = new int [2];
            m[8] = 5;
        } catch (Exception e){
            System.out.println("Исключение для кода b) " + e);
        }

        try {
            ArrayList<String> list = new ArrayList <String>();
            String s = list.get(18);
        } catch (Exception e){
            System.out.println("Исключение для кода c) " + e);
        }
    }
}
