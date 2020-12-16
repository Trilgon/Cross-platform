package practiceOne;

public class TaskSix {
    public void solutionSix() {
        int[] fibs = new int[11];
        fibs[0] = 1;
        fibs[1] = 1;

        for (int i = 2; i < fibs.length; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        for (int num : fibs) {
            System.out.print(num + " ");
        }
    }
}
