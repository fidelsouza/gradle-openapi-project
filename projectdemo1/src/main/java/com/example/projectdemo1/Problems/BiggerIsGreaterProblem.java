package com.example.projectdemo1.Problems;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class BiggerIsGreaterProblem {

    /*
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w , boolean hadSwap, int positionChanged) {
        // Write your code here

        char[] wordArray = w.toCharArray();

        String smaller = "";

        for(int i=wordArray.length-1;  i>=1; i--){


            for(int j = i - 1; j>=0; j--){

//                if(hadSwap == false){

                    if(Character.compare(wordArray[i], wordArray[j] )>0 ){

                        char[] wordArrayTemp = wordArray;

                        char valueSwapped = wordArrayTemp[j];
                        wordArrayTemp[j] = wordArrayTemp[i];
                        wordArrayTemp[i] = valueSwapped;

                        if(i-j == 1){
                            return String.valueOf(wordArray);
                        }

                        return biggerIsGreater (String.valueOf(wordArray), true, j);
                        //hadSwap = true;
                    }
//                }
//                else{
//
//                    if(j == positionChanged){
//                        break;
//                    }
//
//                    if(Character.compare(wordArray[i], wordArray[j] )<0 ){
//
//                        char valueSwapped = wordArray[j];
//                        wordArray[j] = wordArray[i];
//                        wordArray[i] = valueSwapped;
//
//                        return biggerIsGreater (String.valueOf(wordArray), true, positionChanged);
//                        //hadSwap = true;
//                    }
//
//                }


            }

        }

        if(hadSwap == false){
            return "no answer";
        }

        return w;
    }
}

 class SolutionBiggerIsGreater {
    public static void main(String[] args) throws IOException {

        System.out.println( BiggerIsGreaterProblem.biggerIsGreater("mhtvaqofxtyrz", false, -1));


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int T = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, T).forEach(TItr -> {
//            try {
//                String w = bufferedReader.readLine();
//
//                String result = BiggerIsGreaterProblem.biggerIsGreater(w);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
