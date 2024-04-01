package com.example.projectdemo1.Problems;

import java.util.*;

public class NonDivisibleSubset {



    public static void main(String[] args){

        System.out.println(nonDivisibleSubset(3, Arrays.asList(1,7,2,4)));

    }

    public static int nonDivisibleSubset(int k, List<Integer> values) {
        // Write your code here

        List<Set<Integer>> subsets = new ArrayList<>() ;

        Set<Integer> subset;

        for(int i =0; i< values.size(); i++){

            subset = new HashSet<>();
            subsets.add(subset);

            for(int j = 0; j< values.size() && i!=j; j++){

                if( (values.get(i)+ values.get(j)) % k != 0){

                    subset.add(values.get(i));

                    boolean isPossibleToAdd = true;
                    for(Integer value: subset){
                        if(value!= values.get(i) && value!= values.get(j) && ( (value+ values.get(j)) % k == 0)){
                            isPossibleToAdd =false;
                        }
                    }

                    if(isPossibleToAdd){
                        subset.add(values.get(j));
                    }
                }
            }

        }

        int biggest = 1;

        for(Set<Integer> val : subsets){

            if(val.size()> biggest){
                biggest = val.size();
            }
        }



        return biggest;
    }
}
