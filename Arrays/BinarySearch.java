import java.util.*;

public class BinarySearch {
    public static int BS(int number[], int key) {
        int start = 0, end = number.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(number[mid] == key) {
                return mid;
            }

            if(number[mid] < key) { //right
                start = mid + 1;
            }
            else { //left
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        int number[] = {2, 4, 6, 8, 10, 12};
        int key = 8;
        System.out.println("Index for key is : " + BS(number, key));
    }
}
