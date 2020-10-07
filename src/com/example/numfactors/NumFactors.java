package com.example.numfactors;

public class NumFactors {
    public static void main(String[] arg) {

         FactorsOfNum();

    }

    public static void FactorsOfNum() {
        for (int i = 1; i<50 ; i++) {

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
