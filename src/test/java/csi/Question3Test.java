package csi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Question3Test {

    @Test
    public void solve() {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4, 5};
        ArrayList<int[]> answer = Question3.solve(input);
        for(int[] triplet : answer){
            System.out.println(Arrays.toString(triplet));
        }

        assertArrayEquals(new int[]{-4, -1, 5}, answer.get(0));
        assertArrayEquals(new int[]{-1, -1, 2}, answer.get(1));
        assertArrayEquals(new int[]{-1, 0, 1}, answer.get(2));

        // This part is interesting. It's different than the given problem.
        // It depends on how you count unique. In there are two [-1, 0, 1]
        // They are different locations in memeroy, but the same values.
        // The reason being there is two -1's. So we can make that array of
        // values twice, but still use different indices (different -1s).
        assertArrayEquals(new int[]{-1, 0, 1}, answer.get(3));


    }
}