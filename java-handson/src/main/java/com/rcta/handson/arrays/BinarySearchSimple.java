package com.rcta.handson.arrays;
import java.util.Arrays;

public class BinarySearchSimple {

    public static void main(String[] a) {

        int[] numbers = {23, 87, 12, 98, 33, 2, 789};

        Arrays.sort(numbers);

        System.out.println("Sorted Array:"+Arrays.toString(numbers));

        int result = binarySearch(numbers, 12);

        System.out.println((result == -1) ? "Entered element not found in the given array" : "Element found at index " + result);


    }

    public static int binarySearch(int[] array, int target) {
        int first = 0, last = array.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

}
