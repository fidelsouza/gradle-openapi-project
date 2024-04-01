package com.example.projectdemo1.Problems;

import java.util.Map;

public class SherlokAndSquaresProblem {

    public static void main(String[] args){

//        System.out.println(Math.sqrt(9)%1 == 0);
//        System.out.println(Math.sqrt(5)%1 == 0);

        System.out.println(squares(24,49));
    }

    public static int squares(int a, int b) {
        // Write your code here

        int cont = 0;

        for(int i= a; i<= b; i++){

            if(Math.sqrt(i)%1 == 0){
                cont++;
            }
        }


        return cont;
    }

}
