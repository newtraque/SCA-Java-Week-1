package com.example.numfactors;

public class NumFactors {
    public static void main(String[] arg) {
        int n = 50;

        for (int i = 0; i <n; i++) {
            if (i % 2 == 0) {
                System.out.println("The number is even: " + i);

            }
            else if (i % 5 == 0) {
                System.out.println("The number is divisible by 5: " + i);
            }
            else {
                System.out.println("None of the above: " + i);
            }
        }

    }

}
