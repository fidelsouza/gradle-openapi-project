package com.example.projectdemo1.Problems;

import java.math.BigInteger;

public class ExtraLongFactorial {

    public static void main(String[] args){

        extraLongFactorials(3);

    }

    public static void extraLongFactorials(int n) {
        // Write your code here

        BigInteger value = BigInteger.valueOf(n);

        for(long i=n; i>1; i--){

            value = value.multiply(BigInteger.valueOf(i-1));
            //value = value* (i-1);

        }
        System.out.println(value);

    }
}
