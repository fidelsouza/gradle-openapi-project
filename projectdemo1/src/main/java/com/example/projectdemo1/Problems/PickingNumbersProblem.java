package com.example.projectdemo1.Problems;

import java.util.Arrays;
import java.util.List;

public class PickingNumbersProblem {

    public static void main(String[] args){

        System.out.println(pickingNumbers(Arrays.asList(4, 6 ,5 ,3 ,3 ,1)));
        System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1 ,2)));

    }

    public static int pickingNumbers(List<Integer> array) {
        // Write your code here

        int biggestArray = 0;

        int reference;
        int[] arrayT;

        for(int i=0; i<array.size(); i++){

            reference = array.get(i);

            int cont =1;
            for(int j = i+1; j< array.size(); j++){

                if(array.get(j)-reference == 1 || array.get(j)-reference == 0){
                    cont++;
                }
            }

            if(cont>biggestArray){
                biggestArray = cont;
            }

            int cont2 =1;
            for(int j = i+1; j< array.size(); j++){

                if(reference - array.get(j) == 1 || reference - array.get(j) == 0){
                    cont2++;
                }
            }

            if(cont2>biggestArray){
                biggestArray = cont2;
            }


        }

        return biggestArray;
    }
}
