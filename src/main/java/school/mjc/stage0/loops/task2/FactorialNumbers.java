package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1, i = 1;
        System.out.println(factorial);
        while(i <= printToInclusive) {
            factorial *= i;
            System.out.println(factorial);
            i++;
        }
    }
}
