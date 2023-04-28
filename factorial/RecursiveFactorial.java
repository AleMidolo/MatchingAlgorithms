package algorithms.factorial;

public class RecursiveFactorial {

    public int recursiveFactorial(int n) {
        if (n == 0) return 1;
        return n * fattoriale(n - 1);
    }
}
