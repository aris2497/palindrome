package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    
    //checking if a word is a palindrome using for loop

    public static void main(String[] args) {
        int x = 3;
        boolean isOn = true;

        String name = new String(); //instantiating a blank string
        name = "racecar";
        String name2 = new String("Frank");//instantiating
        // a string with a value
        String name3 = "Daniel";
        char first = name.charAt(0);
        Character firstChar = first;
        //coping the value of the 'first' object
        boolean bool = Character.isUpperCase(firstChar);

        //if a world is palindrome or not
        for (int i = 0; i < name.length()/2; i++){
            if(name.charAt((name.length()-i - 1)) != name.charAt(i)){
                System.out.println("no");
                break;
            }  else if (i == (name.length()/2) - 1) {
                System.out.println("yes");
            }
        }


        for(char letter: name.toCharArray()){

        }


    }
}
