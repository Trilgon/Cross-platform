package practiceOne;

public class TaskOne {
    public static void solutionOne() {
        double[] rnums = new double[10];
        double max = 0.0;
        double min = 1.0;
        double ave = 0.0;

        for (int i = 0; i < rnums.length; i++) {
            rnums[i] = Math.random();
        }
        for (double num : rnums) {
            System.out.println(num);
        }
        for (double rnum : rnums) {
            if (max < rnum) max = rnum;
        }
        System.out.println("Maximum value is " + max);
        for (double rnum : rnums) {
            if (min > rnum) min = rnum;
        }
        System.out.println("Minimum value is " + min);
        for (double rnum : rnums) {
            ave += rnum;
        }
        ave = ave / 10;
        System.out.println("Average value is " + ave);
    }
}
