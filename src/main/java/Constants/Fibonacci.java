package Constants;

public class Fibonacci {
    public void fibo(int n) {
        int a = 0, b = 1; // First two Fibonacci numbers

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b; // Next Fibonacci number
            a = b;            // Shift 'a' to 'b'
            b = next;         // Shift 'b' to 'next'
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibo(10); // Print first 10 Fibonacci numbers
    }
}
