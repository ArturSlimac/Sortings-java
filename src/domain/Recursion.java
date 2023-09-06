package domain;

public class Recursion {

    public int iterativeFactorial(int num) {
        if (num == 0)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //4!=4*3*2*1=4*3!
    //n!=n*(n-1)!
    public  int recursiveFactorial(int num) {
        if (num == 0)
            return 1;
        return num * recursiveFactorial(num-1);
    }
}
