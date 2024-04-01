package com.example.projectdemo1.Problems;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivisionProblem {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

//        int cont = 0;
//        int sum = 0;
//
//        int contSeg = 0;

//        for( Integer val: s){
//
//            sum += val;
//            cont++;
//
//            //length matches month
//            if(cont==m ){
//
//                if(sum == d){
//                    contSeg++;
//                }
//
//                //refresh
//                if(cont>1){
//
//                    cont=1;
//                    sum = val;
//                }
//                else{
//                    cont=0;
//                    sum = 0;
//                }
//
//            }
//
//        }

        int count = 0;
        int sum = 0;

        int countSeg = 0;
        for (int i= 0; i< s.size(); i++){

            sum+=s.get(i);
            count++;

            if(count==m){

                if(sum == d){
                    countSeg++;
                }
                    count=0;
                    sum = 0;
                    continue;
            }

            for(int j=i+1; j<s.size();j++){

                if( (s.size() - i )<m ){
                    count=0;
                    sum = 0;
                    break;
                }

                sum+=s.get(j);
                count++;

                if(count ==m){

                    if(sum == d){
                        countSeg++;
                    }
                    count=0;
                    sum = 0;
                    break;
                }


            }
        }

        return countSeg;
    }

    public static void main(String[] args){

       System.out.println(birthday( Arrays.asList(1 ,2 ,1 ,3, 2), 3,2));
//
        System.out.println(birthday( Arrays.asList(2, 5, 1 ,3 ,4 ,4 ,3 ,5 ,1, 1 ,2 ,1 ,4 ,1, 3, 3, 4, 2, 1), 18,7));

        System.out.println(birthday( Arrays.asList(4 ,5 ,4 ,2 ,4 ,5 ,2, 3, 2, 1, 1 ,5 ,4), 15,4)); //TC4 Expected 3


        //1,2,3,4

    }
}
