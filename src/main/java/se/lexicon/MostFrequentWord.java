package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MostFrequentWord {
    void main(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat", "dog", "cat","bird","dog","cat","fish","dog","dog"));
        String mostFrequent = "";
        int maxCount = 0;

        //Check each word in the list
        for(String word: words){
            //Count how many times the word appears
            int count = Collections.frequency(words,word);
            //Update if current word has higher count
            if(count>maxCount){
                maxCount = count;
                mostFrequent=word;
            }


        }
        IO.println("Most frequent word: " +mostFrequent);
        IO.println("Count: " +maxCount);
    }
}
