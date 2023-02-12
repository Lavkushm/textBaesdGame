import java.util.Scanner;

public class BubbleSort {
    public void bubbleSort() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n=sc.nextInt();
        System.out.println();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
           arr[i]= sc.nextInt();
        }
        // Loop through the entire array
        for (int i = 0; i < arr.length; i++) {
            // Set a flag to check if the array is already sorted
            boolean isSorted = true;
            // Loop through the array up to the last element
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // Set the flag to false since the array is not sorted yet
                    isSorted = false;
                }
            }
            // If the array is already sorted, break out of the loop
            if (isSorted) {
                break;
            }
        }
        System.out.println("Sorted array is using bubble sort :");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSort c=new BubbleSort();
        c.bubbleSort();
    }
}
