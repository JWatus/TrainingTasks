package com.company.sorting;

/** Time Complexity: O(n2) as there are two nested loops.

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

        1) The subarray which is already sorted.
        2) Remaining subarray which is unsorted.

        In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted
        subarray is picked and moved to the sorted subarray.

        Following example explains the above steps:

        arr[] = 64 25 12 22 11

 Find the minimum element in arr[0...4]
 and place it at beginning
        11 25 12 22 64

 Find the minimum element in arr[1...4]
 and place it at beginning of arr[1...4]
        11 12 25 22 64

 Find the minimum element in arr[2...4]
 and place it at beginning of arr[2...4]
        11 12 22 25 64

 Find the minimum element in arr[3...4]
 and place it at beginning of arr[3...4]
        11 12 22 25 64

The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
*/

public class SelectionSort {
    private void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Swap the found minimum element with the first
            // element
            swapElements(arr, i, min_idx);
        }
    }

    private void swapElements(int[] arr, int i, int min_idx) {
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }

    // Prints the array
    private void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}