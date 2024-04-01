package com.example.projectdemo1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){

        System.out.println("Is prime 3: "+isPrime(3));
        System.out.println("Is prime 4: "+isPrime(4));
        System.out.println("Is prime 5: "+isPrime(5));
        System.out.println("Is prime 6: "+isPrime(6));
        System.out.println("Is prime 7: "+isPrime(7));
        System.out.println("Is prime 8: "+isPrime(8));
        System.out.println("Is prime 10: "+isPrime(10));
        System.out.println("Is prime 11: "+isPrime(11));
        System.out.println("Is prime 13: "+isPrime(13));

        int[] array = {3,8,9,10,11};
        printArray(array);

    }

    public static void printArray(int[] array){

        for(int i: array){
            System.out.println(i);
        }

    }

    public static boolean isPrime(int n){

        if(n == 0 || n == 1){
            return false;
        }

        if(n == 2){
            return true;
        }

        for(int i = 2; i < n;i ++){

            if(n % i ==0){
                return false;
            }

        }

        return true;
    }

}
