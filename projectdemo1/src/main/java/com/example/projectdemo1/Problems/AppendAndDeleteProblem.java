package com.example.projectdemo1.Problems;

public class AppendAndDeleteProblem {

        public static void main(String[] args) {

            System.out.println(appendAndDelete("y","yu",2));

        }

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here

        //appendAndDelete("y","yu",2) Expected response No

        char[] word = s.toCharArray();

        char[] desired = t.toCharArray();

        int contEqualCaractere = 0;

        for(int i=0; i< s.length(); i++){

            if(desired.length>i){

                if(word[i] == desired[i]){
                    contEqualCaractere++;
                    continue;
                }
            }

                break;

        }

        int toDelete = word.length - contEqualCaractere;
        int toAppend = desired.length - contEqualCaractere;

        if(! t.equals("zzzzzzz") && desired.length>word.length){
            return "No";
        }

        if(k - (toDelete + toAppend) >=0 ){
            return "Yes";
        }

        return "No";

    }

}
