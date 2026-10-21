package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;

public class CountByLetter {
    void main(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Bob", "Alice", "Charlie", "Amanda", "David", "Amy", "Brian"));
        String letter = IO.readln("Enter a letter: ").trim();

        if(!isValidLetter(letter)){
            IO.println("Invalid Input!");
            return;
        }
        letter= letter.toLowerCase();
        int count=0;
        //Checking each name
        for(String name : names){
            if(name.toLowerCase().startsWith(letter)) count++;
        }
        IO.println("Total names: " +count);

    }
    public static boolean isValidLetter(String letter){
        return letter!=null && letter.length()==1&&Character.isLetter(letter.charAt(0));
    }
}
