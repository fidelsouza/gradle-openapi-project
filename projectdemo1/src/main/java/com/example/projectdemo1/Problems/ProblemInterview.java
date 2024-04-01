package com.example.projectdemo1.Problems;

public class ProblemInterview {

//    Open any Java or JavaScript compiler and write code to solve this problem. Show your screen.
//            If a=1, b=2, c=3, …………. z= 26, and 1=1, 2=2, 3=3, etc.; input an alphanumeric string and calculate the sum of that string.
//            Input: hello123
//    Output: 58
//            (Where h=8, e=5, l=12, l=12, o=15, 1=1, 2=2, 3=3)

    public static void main(String[] args){

        System.out.println(calculateSum("hello123"));
    }

    public static int calculateSum(String word ){

        char[] array = word.toCharArray();

        int sum = 0;
        for(char val: array){

            if(Character.isAlphabetic(val)){
                sum+= getPosition(val);
            }
            else{
                int t = Integer.valueOf(String.valueOf(val));
                sum+= t;
            }

        }
        return sum;
    }

    public static int getPosition(char val){

        char[] arrayAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i< arrayAlphabet.length; i++){

            if(val == arrayAlphabet[i]){
                return i+1;
            }
        }

        return 0;

    }
}
