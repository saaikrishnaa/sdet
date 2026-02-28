package com.rcta.handson.arrays;



public class InsertElementFrontBackAny {

    int count = 0;
    public static void main(String[] values){

        int numbers[] = new int[5];

        InsertElementFrontBackAny instance = new InsertElementFrontBackAny();

        for(int i=0; i<numbers.length; i++) {
            instance.feed(numbers, i);
        }

//        instance.get(numbers);

        instance.insertElementAtTheBeginning(numbers,5);
        instance.insertElementAtTheBeginning(numbers,23);

        instance.insertGivenElementAtGivenPostition(numbers,2,32);
        instance.insertGivenElementAtGivenPostition(numbers,3,454);

        instance.get(numbers);

    }

    private void feed(int givenArray[], int valueAtIndex){
        givenArray[count++]=valueAtIndex;
    }

    private void get(int givenArray[]){
        for(int i=0; i<givenArray.length;i++) {
            System.out.print(givenArray[i]+" ");
        }
    }

    private void insertElementAtTheBeginning(int givenArray[], int elementToInsert){

        for(int i=givenArray.length-1; i>0;i--){
            givenArray[i] = givenArray[i-1];
        }
        givenArray[0] = elementToInsert;
    }

    private void insertGivenElementAtGivenPostition(int givenArray[], int position, int elementToInsert){

        for(int i= givenArray.length-1;i>position;i--){
            givenArray[i] = givenArray[i-1];
        }
        givenArray[position] = elementToInsert;
    }
}
