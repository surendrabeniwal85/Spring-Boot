package org.example;

public class exampleLogpoint2 {
    public static void main(String[] args){

        int[] numbers = {10, 20, 30};
        int total = 0;

        for(int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
            System.out.println("Current Total : " + total);
        }
        System.out.println("Final total : " + total);
    }
}
