package com.example.projectdemo1;

import java.util.HashSet;
import java.util.Set;

public class TestDominos {
    public static void main(String[] args){

     String s = "FIDEL";
     String s2 = "ANA";

        System.out.println(hasUniqueCarachters(s));
        System.out.println(hasUniqueCarachters(s2));

        System.out.println(hasUniqueCarachters(""));
        System.out.println(hasUniqueCarachters("  "));

    }

    public static boolean hasUniqueCarachters( String str){

        Set<Character> set = new HashSet<>();

        char[] ar = str.toCharArray();
        for(Character c : ar){

            if(set.contains(c)){
                return false;
            }

            set.add(c);
        }

        return true;
    }

}
