import java.util.*;

public class LinearSearch {
    public static int LS(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 5, 8, 90, 10, 78, 45};
        int key = 10;

        int index = LS(numbers, key);
        if(index == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Key at index : " + index);
        }
    }
}
