package org.basic;

public class FibonacciTest {
    public void fibonacciSeries(int num) {
        int first = 0, second = 1, sum;
        System.out.print(first + " ," + second);
        for (int i = 2; i < num; i++) {
            sum = first + second;
            System.out.print(", " + sum);
            first = second;
            second = sum;
        }
    }

    public static void main(String[] args) {
        new FibonacciTest().fibonacciSeries(0);
    }
}
