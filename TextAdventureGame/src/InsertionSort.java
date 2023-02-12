import java.util.Scanner;

public class InsertionSort {
    void insertionSort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n=sc.nextInt();
        System.out.println();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        // Loop through the entire array
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in the unsorted portion of the array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element of the unsorted portion
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        SelectionSort c= new SelectionSort();
        c.selectionSort();
    }
}
