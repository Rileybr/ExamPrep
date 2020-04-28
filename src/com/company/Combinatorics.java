package com.company;

public class Combinatorics {

    /** Precondition: n is between 1 and 12, inclusive.
     * Returns the factorial of n, as described in part (a). */
    public static int factorial(int n)
    { /* to be implemented in part (a) */
        int factorial = n;

        if (n == 1){
            return 1;
        }
        else {
            for (int i = n-1; i > 0; i--){
                factorial *= i;
            }
        }
        return factorial;
    }


    /** Precondition: n and r are between 1 and 12, inclusive. * Determines the number of ways r items can be selected
     * from n choices and prints the result, as described in part
     (b). */
    public static void numCombinations(int n, int r)
    { /* to be implemented in part (b) */
        int com = 0;
        if (r > n){
            System.out.println("There are 0 ways of choosing "+ r +" items from " + n + " choices.");
        }
        else {
            com = factorial(n) / (factorial(r) * (factorial(n-r)));
            System.out.println("There are " + com + " ways of choosing " + r + " items from " + n + " choices.");
        }
    }
}
