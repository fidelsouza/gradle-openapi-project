package com.example.projectdemo1.Problems;

public class SaveThePrisonerProblem {

    public static void main(String[] args){

        System.out.println(saveThePrisoner(5,289039948,3));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        if(m==0){
            return 0;
        }

        int r = -1;
        if(m>n){
             r = m%n;

        }
        else{
            r = m;
        }


        int sob1 = n - s +1;

        if(r==0){
            if(s==1){
                return n;
            }
            else{
                return s - 1;
            }
        }

        if(sob1>=r){
            return s+r - 1;
        }
        else{
            return r - sob1 ;
        }

    }
}
