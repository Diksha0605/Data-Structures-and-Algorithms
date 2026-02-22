//MAXIMUM SUBARRAY SUM : BRUTE FORCE

import java.util.*;

public class MaxSubarraySum1 {
    public static void printSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int last = j;
                currSum = 0;
                for(int k=start; k<=last; k++) { //print
                    //subarray sum
                    currSum += numbers[k];
                }

                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("MAximum Sum of array : " + maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        printSubarraySum(numbers);
    }
}
