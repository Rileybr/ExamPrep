package com.company;

public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public static int spin(int min, int max)
    {
        int result = (int)(Math.random()*(max-min+1))+(min);

        return result;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public static void playRound() {
        int count = 0;
        while (count < 2) {
            int player = spin(1, 10);
            System.out.println(player);
            int computer = spin(2, 8);
            System.out.println(computer);
            int dif = player - computer;
            System.out.println(dif);
            if (dif > 0) {
                System.out.println("You win! " + dif + " points");
                break;
            }
            else if (dif < 0) {
                System.out.println("You lose. " + dif + " points");
                break;
            }
            else {
                count++;
            }
        }
        if (count == 2){
            System.out.println("Tie. 0 points");
        }
    }

    public static void main(String[] args){
        playRound();
    }
}



