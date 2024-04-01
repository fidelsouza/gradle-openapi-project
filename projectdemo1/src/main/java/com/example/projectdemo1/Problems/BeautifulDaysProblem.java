package com.example.projectdemo1.Problems;

public class BeautifulDaysProblem {

    public static void main(String[] args)  {

        System.out.println(beautifulDays(20,23,6));
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here

        int cont = 0;
        for(int t = i; t<= j; t++ ){

            int rev = reverse(t);
            if( (t - rev) % k == 0){
                cont++;
            }

        }

        return cont;

    }

    static int reverse(int val){
        if (val<=9){
            return val;
        }

        char[] array = String.valueOf(val).toCharArray();

        char[] rev = new char[array.length];

        int cont = 0;
        for (int i = array.length-1; i>=0; i--){

            rev[cont] = array[i];

            cont++;
        }

        return Integer.valueOf( String.valueOf(rev));
    }
}
