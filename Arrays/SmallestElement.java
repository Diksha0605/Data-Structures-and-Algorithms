import java.util.*;
public class SmallestElement {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 5, 89, 65, 98, 99};

        System.out.println("Smallest value is : " + getSmallest(numbers));
    }
}
