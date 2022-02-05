package com.delazari.fibonacci.code;

/**
 *
 * @author Leonardo Delazari
 */
public class Fibonacci {

    private static long[] memoization;

    public static void main(String[] args) {

        int n = 50;
        memoization = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacciCalc(i) + " ");
        }

    }

    private static long fibonacciCalc(int n) {
        if (n < 2) {
            return n;
        }

        if (memoization[n] != 0) {
            return memoization[n];
        }

        long nthFibonacciNumber = (fibonacciCalc(n - 1) + fibonacciCalc(n - 2));

        memoization[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }

}
