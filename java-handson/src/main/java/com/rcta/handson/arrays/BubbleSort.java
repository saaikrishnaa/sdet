package com.rcta.handson.arrays;

public class BubbleSort {

    /**
     * bubble sort:
     * a brute force algorithm, this solves the problem in O(n2), the complexity is not good
     *
     * pseudo:
     * > after each iteration, the highest value at that time, will be pushed to the end(last index)
     * > the next iteration, will include all other values, and not include the pushed value
     * > and it repeats until all the iterations are completed
     */


    public static void main(String[] args){

        int[] numbers = {22,3,0,5,12,-1,-43,334};

        BubbleSort sort = new BubbleSort();

        int[] sortedArray = sort.bubbleSortLogic(numbers);

        sort.writeArrayToConsole(sortedArray);
    }

    private int[] bubbleSortLogic(int[] given){

        if(given.length == 0 || given.length == 1){
            return given;
        }

        int swapTemp = 0;

        for(int i=0; i<given.length-1; i++){

            for(int j=0;j<given.length-1-i;j++) {

                if (given[j]>given[j + 1]) {
                    swapTemp = given[j];
                    given[j] = given[j + 1];
                    given[j + 1] = swapTemp;
                }
            }
        }
        return given;
    }

    private void writeArrayToConsole(int[] sortedArray){

        for(int i=0; i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
    }
}
