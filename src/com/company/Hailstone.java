package com.company;

public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        int count = 1;
        while (n!= 1){
            if (n%2 == 0){
                n = n/2;
            }
            else {
                n = 3*n + 1;
            }
            count++;
        }
        return count;
        /* to be implemented in part (a) */

    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        int length = hailstoneLength(n);
        if (length > n){
            return true;
        }
        else {
            return false;
        }
        /* to be implemented in part (b) */

    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
        int numLong = 0;
        for (int i = n; i > 0; i--){
            if (isLongSeq(i)){
                numLong++;
            }
        }
        return (double)numLong/n;
    }

    // There may be instance variables, constructors, and methods not shown.
}
