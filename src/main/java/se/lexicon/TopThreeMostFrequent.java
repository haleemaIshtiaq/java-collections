package se.lexicon;

import java.util.*;

public class TopThreeMostFrequent {
    void main(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "python", "java", "c++", "python", "java", "ruby", "c++", "python", "ruby", "java"));
        String mostFrequent ;
        int maxCount ;
        int count=0;

        LinkedHashMap<String,Integer> unique = new LinkedHashMap<>() ;
        while(!words.isEmpty() ){
            mostFrequent = "";
             maxCount = 0;
            //Check each word in the list
            for (String word : words) {
                //Count how many times the word appears
                count = Collections.frequency(words, word);

                //Update if current word has higher count
                if (count > maxCount) {
                    maxCount = count;
                    mostFrequent = word;
                }
            }
            unique.put(mostFrequent, maxCount);
            words.removeAll(Collections.singleton(mostFrequent));
        }
        IO.println(unique);
    }
}
