package com.rcta.handson.arrays;

public class SearchElement {

    public static void main(String... v){

        /*
        * 1. define integer array
        * 2. if array size is = 0, return -1 and handle with message
        * 3. if array size is > 0,
        *   if entered element exists, return the index
        *   else, return -1
        * */

        int[] numbers = {234,1234,123,45,234,4567,56,897};

        SearchElement instance = new SearchElement();
        int result = instance.findElementReturnIndex(numbers,56);

        if(result == -1){
            System.out.println("Array size is 0 / Element not found");
        }else{
            System.out.println("Entered element is at index: "+result);
        }

    }

    private int findElementReturnIndex(int[] givenArray, int elementToSearch){
        if(givenArray.length == 0){
            return -1;
        }

        for(int i=0; i< givenArray.length; i++){
                if(elementToSearch == givenArray[i])
                    return i;
            }
        return -1;
        }
}
