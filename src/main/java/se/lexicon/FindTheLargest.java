package se.lexicon;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.ArrayList;
import java.util.Arrays;

public class FindTheLargest {
    void main(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(14,3,78,45,22,91,7,56));
        //Assume first number is largest
        int max = numbers.get(0);
        for(int number : numbers){
            if(number>max){
                max=number;
            }
        }
        IO.println("Largest number: " +max);
    }
}
