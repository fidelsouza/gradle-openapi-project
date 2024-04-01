package com.example.projectdemo1.Problems;

public class EletronicsShopProblem {

    public static void main(String[] args){

        int[] keyboards = {4};

        int[] drives = {5};

        System.out.println(getMoneySpent(keyboards,drives,5));


    }


    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */

        int biggest = - 1;
        for(int kVal : keyboards){

            for(int dVal: drives){

                if(kVal+dVal <= b && kVal+dVal> biggest){
                    biggest = kVal+dVal;
                }
            }
        }

        return biggest;

    }
}
