package com.example.projectdemo1.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatchProblem {

    public static void main(String[] args){


        System.out.println(sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));

    }

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Map<Integer, Integer> mapSocks = new HashMap<>();

        for(Integer sock : ar){

            if(mapSocks.containsKey(sock)){
                mapSocks.put(sock, mapSocks.get(sock)+1);
            }
            else{
                mapSocks.put(sock, 1);
            }

        }

        int contPairs = 0;
        for( Integer sock: mapSocks.keySet()){

           int pairs =  mapSocks.get(sock) / 2;
           contPairs+= pairs;
        }

        return contPairs;
    }
}
