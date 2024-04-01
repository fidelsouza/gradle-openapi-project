package com.example.projectdemo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDominos2 {

    //Write a function called valid braces that takes a string of braces
    public static void main(String[] args){


        System.out.println(validBraces("(){}[]"));
        System.out.println(validBraces("([{}])"));

        System.out.println(validBraces("(]"));
        System.out.println(validBraces("[(])"));
        System.out.println(validBraces(" "));

    }

    public static boolean validBraces( String braces){

        if(braces.isBlank()){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        List<Character> openBraces = List.of('(','{','[' );
        List<Character> closedBraces =  List.of(')','}',']');

        char[] array = braces.toCharArray();

        List<Character> listOpenBraces = new ArrayList<>();


        for(int i =0 ; i< array.length; i++){

            if(openBraces.contains( array[i])){
                listOpenBraces.add( array[i]);
                continue;
            }

            if(closedBraces.contains( array[i])){

                if((listOpenBraces.size()-1) < 0 ){
                    return false;
                }

                Character openBraceRemoved = listOpenBraces.remove(listOpenBraces.size()-1);
                if(map.get(openBraceRemoved) == array[i]){
                    continue;
                }
                return false;
            }

        }

        return true;
    }

}
