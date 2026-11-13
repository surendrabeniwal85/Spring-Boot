package org.example;

//Check even number

public class example3 {

    public static void main(String[] args) {
        int num = 10;

        int remainder = num % 2;

        if (remainder == 1) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
