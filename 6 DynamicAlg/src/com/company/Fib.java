package com.company;

public class Fib {
    // Fib
    public int Fib(int a) {
        int f1 = 1, f2 = 1;
        if (a < 1) {
            return 0;
        }
        if (a == 1 ) {
            System.out.println("0 1\n");
        }
        if (a > 1) {
            System.out.println(" 0 1 ");
            for (int j = 1; j < a; j++) {
                f2 = f1 + f2;
                f1 = f2 - f1;
                System.out.println(f1 + " ");
            }
        }
        System.out.println("\n\n");
        return 0;
    }
}
