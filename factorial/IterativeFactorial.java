package algorithms.factorial;

public class IterativeFactorial {
    public int iterativeFactorial(int n) {
        int f = 1;
        while (n > 0) f *= n--;
        return f;
    }
}
