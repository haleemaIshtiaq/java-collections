package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SecondLargest {
    void main(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(34, 78, 23, 78, 91,56,91,12));
        //HashSet removes duplicate numbers
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        //Variables to store largest and second-largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //Check each unique number
        for(Integer number: uniqueNumbers){
            //If a new largest number is found the previous largest becomes second largest
            if(number>largest){
                secondLargest=largest;
                largest=number;
            }
            //otherwise check if it is second largest
            else if (number>secondLargest){
                secondLargest =number;
            }
        }
        if(uniqueNumbers.size()>=2){
            IO.println("Largest: " +largest);
            IO.println("Second Largest: " +secondLargest);

        }
        else{
            IO.println("No second largest unique number");
        }


    }
}
