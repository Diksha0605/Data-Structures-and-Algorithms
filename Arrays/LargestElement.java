import java.util.*;

public class LargestElement {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];;
            }
        }

        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 4, 98, 45, 34, 89};

        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
