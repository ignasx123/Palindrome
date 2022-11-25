package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {


        String n1 = "Whadup!!!";
        String n2 = new String("whadup!!!");

        System.out.println( n1.equals(n2) );

        System.out.println( Palindrome.isPalindrome("HannaH is"));

    }

    public static boolean isPalindrome(String input){

        String result = "";
        for (int i=0; i< input.length(); i++)
        {
            result = input.charAt(i) + result; //adds each character in front of the existing string
        }

        if( result.equals(input) ) return true;
        else return false;

    }

    public static ArrayList<String> countPalindromes(ArrayList<String> arr ){

        ArrayList<String> res = new ArrayList<>();

        for( String str: arr ){
            if( Palindrome.isPalindrome(str) ){
                res.add(str);
            }
        }

        return res;
    }

    }
