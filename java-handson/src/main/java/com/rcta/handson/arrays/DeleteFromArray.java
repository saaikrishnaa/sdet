package com.rcta.handson.arrays;

public class DeleteFromArray {

    static int count=0;

    public static void main(String[] v){

        DeleteFromArray instance = new DeleteFromArray();

        int[] array = {12,34,65,67,63,89,45};
        count = array.length;
        System.out.println("Initial array");
        instance.print(array);
        System.out.println();
        instance.deleteFromEnd(array);
        instance.print(array);
        System.out.println();
        instance.deleteValue(array,653);
        instance.print(array);
    }

    private void deleteFromEnd(int[] given){
        if(given.length <= 0)
            return;
        count=count-1;
    }

    private void print(int[] given){
        for(int i=0; i<count;i++)
            System.out.print(given[i]+" ");
    }

    private void deleteValue(int[] given, int value){
        int i;
        for(i=0;i<given.length-1;i++){
            if(given[i]==value){
                break;
            }
        }

            if(i==count){
                System.out.println("Given value is not found in the array");
                return;
            }

        for(int j=i;j<given.length-1;j++){
            given[j]=given[j+1];
        }
        count=count-1;
    }

}
