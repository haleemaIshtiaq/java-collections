package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class GroupByFirstLetter {
    void main(){
        //ArrayList store names
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Anna", "Charlie","Brian", "Amanda", "Carl"));

        //Character= first letter,
        //ArrayList = names in that group
        TreeMap<Character,ArrayList<String>> groups = new TreeMap<>();

        //Loop through each name
        for(String name: names){
            //Get the first character of the name
            char letter = name.charAt(0);
            //Create empty list if character does not exist
            if(!groups.containsKey(letter)){
                groups.put(letter,new ArrayList<>());
            }
            //Add the name to its matching letter group
            groups.get(letter).add(name);
        }
        //Print each group
        for(Character letter : groups.keySet()){
            IO.println(letter + ": " + groups.get(letter));
        }
    }

}
