package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class MergeWithoutDuplicates {
    void main(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6,7));
        list1.addAll(list2);

        //LinkedHashSet removes duplicates and preserves insertion order
        LinkedHashSet<Integer> uniqueList = new LinkedHashSet<>(list1);

        //Print all numbers without duplicates

        IO.println("Merged unique numbers: " +uniqueList);
        IO.println("Total unique numbers: " +uniqueList.size());

    }
}
