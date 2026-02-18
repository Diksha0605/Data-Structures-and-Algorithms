import java.util.*;

public class SumofArray {
    public static void printSum(int numbers[]) {
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of array : " + sum);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};

        printSum(numbers);
    }
}
