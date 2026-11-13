package org.example;

public class exampleConditionalBreak2 {

    public static void main(String[] args){

        int[] numbers = {10, 20, 30, 40, 50};

        for(int i = 0; i < numbers.length; i++){

            int current = numbers[i];
            if(current == 40){
                    System.out.println("Current No : " + current);
            }
            System.out.println("Checking : " + current);
        }
    }
}
