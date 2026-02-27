import java.util.Arrays;

public class sorting {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {5, 4, 3, 1, 2};
        Arrays.sort(arr);
        printArr(arr);
    }
}
