package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class CommonElements {
    void main(){
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));
         TreeSet<Integer> common = new TreeSet<>();
        for(Integer i : listA){
            for(Integer j: listB){
                if(i.equals(j)){
                    common.add(i);
                }
            }
        }
        IO.println("Common elements are:");
        IO.println(common);

    }
}
