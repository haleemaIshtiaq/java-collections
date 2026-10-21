package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateKeepOrder {
    void main(){
        //Create an ArrayList containing duplicate numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,7,2,7,9,4,1,9,3));

        //LinkedHashSet removes duplicates and preserves insertion order
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(numbers);

        //Convert LinkedHashSet into a new ArrayList
        ArrayList<Integer> newNumbers = new ArrayList<>(uniqueSet);

        //Print original and updated lists

        IO.println("Original list: " +numbers);
        IO.println("List without duplicates: " +newNumbers);

    }
}
