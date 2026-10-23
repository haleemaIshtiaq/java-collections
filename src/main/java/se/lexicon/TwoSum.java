package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 7, 11, 15, 4, 6));
        int target = 13;
        HashSet<Integer> seen = new HashSet<>();

        for (Integer number : numbers) {
            //calculate the number needed to reach the target
            int needed = target - number;

            //Check if needed number was already seen
            if(seen.contains(needed)){
                IO.println("Two numbers: " +needed  + " + " +number);
                return;
            }
            //Store the current number for future check
            seen.add(number);
        }
        IO.println("No pair found.");
    }

}
