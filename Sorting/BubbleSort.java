package Sorting;

public class BubbleSort {
public static void main(String[] args) {
	int[] arr = {9, 6, 7, 4, 2, 1};
    int n = arr.length;

    // Outer loop for each pass
    for (int i = 0; i < n - 1; i++) {
        // Inner loop for comparing adjacent elements
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {  // Compare adjacent elements
                // Swap elements if they are in the wrong order
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    // Printing the sorted array
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
