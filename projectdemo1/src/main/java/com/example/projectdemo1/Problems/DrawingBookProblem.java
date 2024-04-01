package com.example.projectdemo1.Problems;

public class DrawingBookProblem {

    public static void main(String[] args){

        System.out.println(pageCount(5,3));
    }

    public static int pageCount(int n, int p) {
        // Write your code here

        int turns = 0;

        int turnsFromLeft = 0;
        for (int i=1; i<=n;i++ ){

            if(i==p){
                break;
            }

            if(i%2>0){
                turnsFromLeft++;
            }

        }

        int turnsFromRight = 0;
        for (int i=n; i>=1;i-- ){

            if(i==p){
                break;
            }

            if(i%2==0){
                turnsFromRight++;
            }

        }

        if(turnsFromLeft<turnsFromRight){
            return turnsFromLeft;
        }

        return turnsFromRight;
    }
}
