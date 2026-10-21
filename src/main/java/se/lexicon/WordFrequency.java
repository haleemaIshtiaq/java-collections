package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class WordFrequency {
 void main(){
     //Create a list of words
      ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange"));
      //Use treeMap to store each unique word with its frequency
     //and automatically keeps the words in alphabetical order
      //Store each word and its frequency later
     TreeMap<String, Integer> frequency = new TreeMap<>();

     //Count how many times each word appears
     for(String word: words){
         if(frequency.containsKey(word)){
             frequency.put(word,frequency.get(word)+1);

         }
         else{
             frequency.put(word,1);
         }
     }

     //Print words and their counts
     for(String word: frequency.keySet()){
         IO.println(word +": " +frequency.get(word));
     }
 }
}
