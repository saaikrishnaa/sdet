package com.rcta.handson.arrays;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SearchItemBinarySearch {


    private static final Logger logger = LoggerFactory.getLogger(SearchItemBinarySearch.class);

    public static void main(String[] q){

        /*
          0. sort the array in ascending order
        * 1. calculate mid = mid = (first+last)/2;
        * 2. if elementToBeSearched = mid, then return the index which is the result
        * 3. if elementToBeSearched > mid, then ignore the first half and consider the second half, and iteratively apply the same logic
        * 4. if elementToBeSearched < mid, then ignore the second half and consider the first half, and iteratively apply the same logic
        * 5. repeat steps 2,3,4
        *   if array have elements, or first index > last index
        *   else return -1, and handle with a message
        * */


        int[] numbers = {41, 22, 12, 3, 76, 34, 56, 4};
        SearchItemBinarySearch instance = new SearchItemBinarySearch();
        int result = instance.binarySearch(numbers, 12);
        if(result == -1){
            logger.info("Given element not found in the array");
        }else{
            logger.info("Given element found at index "+result);
        }
    }

    public int binarySearch(int[] given, int elementToBeSearched){
        Arrays.sort(given);
        logger.debug("Sorted Array -> " + Arrays.toString(given));
        return binarySearch(given, 0, given.length-1, elementToBeSearched);
    }

    private int binarySearch(int[] givenArray, int startIndex, int endIndex, int elementToBeSearched){
//        boolean flag=false;
//
//        Arrays.sort(givenArray);
//
//        if(!flag) {
//            System.out.println("Sorted Array -> " + Arrays.toString(givenArray));
//        }
//        flag=true;

        if(givenArray.length == 0 || startIndex > endIndex){
            return -1;
        }
        int mid = (startIndex+endIndex)/2;

        if(elementToBeSearched == givenArray[mid]){
            return mid;
        }

        if(elementToBeSearched < givenArray[mid]){
            return binarySearch(givenArray, startIndex, mid-1, elementToBeSearched);
        }else{
            return binarySearch(givenArray, mid+1, endIndex, elementToBeSearched);
        }
    }

}
