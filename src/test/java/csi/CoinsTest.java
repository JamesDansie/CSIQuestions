package csi;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinsTest {

    @Test
    public void minCoinPass() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;

        int ans = Coins.minCoin(coins, amount);

        assertEquals(3, ans);
    }

    @Test
    public void minCoingFail(){
        int[] coins = new int[]{2};
        int amount = 3;

        int ans = Coins.minCoin(coins, amount);

        assertEquals(-1, ans);
    }
}