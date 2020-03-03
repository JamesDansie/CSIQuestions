package csi;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {
    public static ArrayList<int[]> solve (int[] input){
        ArrayList<int[]> answer = new ArrayList<>();
        // if we sort the incoming array then we don't have to
        // brute force it. We can start with the most negative,
        // and the most positive, and work our way to the middle.
        Arrays.sort(input);

        System.out.println(Arrays.toString(input));

        for(int i = 0; i < input.length; i++) {
            // we will be one ahead of the index
            int left = i + 1;
            // the right will start with the most positive number
            int right = input.length - 1;
            // the while loop will work inwards from the outside edges.
            while(left < right){
                int total = input[i] + input[left] + input[right];
                if(total == 0){
                    // if we found it then record it, and move the
                    // left and right to the next possibility.
                    answer.add(new int[]{
                            input[i],
                            input[left],
                            input[right]
                    });
                    left++;
                    right--;
                } else if (total < 0) {
                    // if the total is less than zero, then make the negative (left)
                    // number more positive by incrementing higher.
                    left++;
                } else {
                    // if the total is above zero, then make the positive (right) number
                    // less positive by decrementing lower;
                    right--;
                }
            }
        }

        return answer;
    }
}
