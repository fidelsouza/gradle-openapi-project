package com.example.projectdemo1;

public class TestDominos3 {

    //Complete the method so that it converts dash demilited words into camel casing.
    public static void main(String[] args){

        System.out.println(toCamelCase("the_stealh_warrior"));

        System.out.println(toCamelCase("The-Stealh-Warrior"));

    }

    public static String toCamelCase( String text){

        char[] textArray = text.toCharArray();

        StringBuilder sb = new StringBuilder();

        boolean lastCharWasDash = false;
        for(int i=0; i<textArray.length; i++){

            if(lastCharWasDash && !(textArray[i] == '-' || textArray[i] == '_')){

               sb.append(String.valueOf(textArray[i]).toUpperCase());

               lastCharWasDash = false;
               continue;
            }

            if(textArray[i] == '-' || textArray[i] == '_'){
                lastCharWasDash = true;
                continue;
            }

            sb.append(textArray[i]);

        }

        return sb.toString();
    }

}
