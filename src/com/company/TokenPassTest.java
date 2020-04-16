package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class TokenPassTest {

    @Test
    public void distributeCurrentPlayerTokens() {
        TokenPass game = new TokenPass(4);
        int[] arr = new int[] {6, 7, 3, 2};
        int[] afterArr = new int[] {8, 1, 5, 4};
        game.setBoard(arr);
        game.setCurrentPlayer(1);
        game.distributeCurrentPlayerTokens();
        assertArrayEquals(afterArr, game.getBoard());
        assertEquals(1, game.getCurrentPlayer());
    }

    @Test
    public void distributeCurrentPlayerTokensAgain() {
        TokenPass game = new TokenPass(7);
        int[] arr = new int[] {5, 8, 9, 3, 7, 6, 4};
        int[] afterArr = new int[] {6, 9, 1, 5, 9, 7, 5};
        game.setBoard(arr);
        game.setCurrentPlayer(2);
        game.distributeCurrentPlayerTokens();
        assertArrayEquals(afterArr, game.getBoard());
        assertEquals(2, game.getCurrentPlayer());
    }

    @Test
    public void testConstructor() {
        int players = (int)(Math.random() * 10) + 1;
        TokenPass game = new TokenPass(players);

        boolean correctBoard = true;
        int[] boardArr = game.getBoard();
        for (int i=0; i<boardArr.length; i++) {
            if (!(boardArr[i] > 0 && boardArr[i] <= 10))
                correctBoard = false;
        }
        assertTrue(correctBoard);
        assertTrue(game.getCurrentPlayer() >= 0 && game.getCurrentPlayer() < players);
    }
}